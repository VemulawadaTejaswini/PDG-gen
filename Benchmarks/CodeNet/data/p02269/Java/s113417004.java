import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int LEN = 1046527;
    private static String[] HASHTABLE = new String[LEN];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            String string = br.readLine();
            if (string.charAt(0) == 'i'){
                insert(string.substring(7));
            }
            else {
                if (find(string.substring(5))){
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
        }
    }

    private static boolean find(String string) {

        int key = getKey(string);
        for (int i=0; ;i++){
            int h = (hash1(key)+i*hash2(key)) % LEN;
            if (HASHTABLE[h] == null){
                return false;
            }
            else if (HASHTABLE[h].equals(string)){
                return true;
            }
        }
    }

    private static void insert(String string) {

        // ???????°?????¬??????¬????????°????????¶????°???°?????£??\??£????????°?????°????????\?????????
        // ???????????????????????¨????¬?????????????????????\??????????????????????????????????????????????????¨????????´??\?????\?????????
        int key = getKey(string);
        for (int i=0; ;i++){
            int h = (hash1(key)+i*hash2(key)) % LEN;
            if (HASHTABLE[h] == null){
                HASHTABLE[h] = string;
                break;
            }
            else if (HASHTABLE[h].equals(string)){
                break;
            }
        }
    }

    // ?°?????¬??????¬????????°?????¶??????key
    private static int getKey(String string) {

        int sum = 0;
        int p = 1;
        for (int i=0; i<string.length(); i++){
            sum += p*getChar(string.charAt(i));
            p *= 5;
        }

        return sum;
    }

    private static int getChar(char c) {
        switch (c){
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                return 0;
        }
    }

    // ??????????????£????????°
    private static int hash1(int key){
        return key % LEN;
    }

    private static int hash2(int key){
        return 1 + (key % (LEN-1));
    }
}