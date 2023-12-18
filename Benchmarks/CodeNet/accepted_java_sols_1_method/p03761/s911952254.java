import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int alpha[][] = new int[n][26];

        for (int i = 0; i < n; i++) {
            String s = in.next();
            Arrays.fill(alpha[i], 0);
            for (int j = 0; j < s.length(); j++) {
                int c = s.charAt(j) - 'a';
                alpha[i][c]++;
            }
        }

        int alphaCount[] = new int[26];
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(alpha[j][i], min);
            }
            alphaCount[i] = min;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < alphaCount[i]; j++) {
                System.out.print((char)('a' + i));
            }
        }
        System.out.println();
    }
}