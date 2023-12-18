import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        char now;
        char a = 'a';
        int[] data = new int[26];

        for(int i = 0; i < line.length(); i++){
            now = line.charAt(i);
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