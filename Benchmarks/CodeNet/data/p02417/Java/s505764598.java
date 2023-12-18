import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = new int[26];
        while(scan.hasNext()) {
            String S = scan.nextLine();
            String s = S.toUpperCase();
            for(int i = 0; i < s.length(); i++) {
                int k = (int)s.charAt(i) - 65;
                if(k >= 0 && k <= 25) {
                    n[k]++;
                }
            }
        }

        for(int i = 0; i < 26; i++) {
            int ch = i + 97;
            char c = (char)ch;
            System.out.println(c + " : " + n[i]);
        }
    }
}


