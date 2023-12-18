import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        for(int i = 0; i < 26; i++) alpha[i] = 0;
        while(sc.hasNext()) {
            String str = sc.next().toLowerCase();
            int S = str.length();
            for(int i = 0; i < S; i++) {
                int x = str.charAt(i);
                if(x >= 97 && x <= 122) alpha[x-97]++;
            }
        }

        for(int i = 0; i < 26; i++) System.out.printf("%c : %d\n", (char)(i+97), alpha[i]);
    }
}
