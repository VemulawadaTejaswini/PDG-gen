import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(sc.hasNextLine()){
            sb.append(sc.nextLine().toLowerCase());
        }

        char a = 'a';
        int[] data = new int[26];
        String str = sb.toString();

        for(int i = 0; i < str.length(); i++){
            char now = str.charAt(i);
            for(int j = 0; j < 26; j++){
                if(now == (char)(a+j)){
                    data[j]++;
                    break;
                }
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.println((char)(a+i) + " : " + data[i]);
        }
    }
}
