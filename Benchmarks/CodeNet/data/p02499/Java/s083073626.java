import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count[] = new int[26];
        for (int i = 0; i < 26; i++){count[i] = 0;}
        String str;
        while(sc.hasNext()){
            str = sc.nextLine().toLowerCase();
            boolean leave = false;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) - 'a' >= 0 && 'z' - str.charAt(i) >= 0){
                    count[str.charAt(i) - 'a']++;
                }
            }
        }
        for (int i = 0; i < 26; i++){
            System.out.printf("%c : %d\n", 'a' + i, count[i]);
        }
    }
}