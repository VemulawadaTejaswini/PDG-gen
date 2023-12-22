import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.StringTokenizer;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(f.readLine());
        // int N = Integer.parseInt(st.nextToken());
        // int W = Integer.parseInt(st.nextToken());

        String s = f.readLine();
        String t = f.readLine();

        int sLen = s.length();
        int tLen = t.length();

        int[][] dp = new int[sLen + 1][tLen + 1]; // default init to 0

        // int maxSubseqLen = 0;
        // String longest = "";

        for (int _i = 1; _i < sLen + 1; _i++) {
            for (int _j = 1; _j < tLen + 1; _j++) {
                int i = _i - 1;
                int j = _j - 1;


                if (s.charAt(i) == t.charAt(j)) {

                    dp[_i][_j] = dp[_i-1][_j-1] + 1;
                    /* if (dp[_i][_j] > maxSubseqLen) {
                        System.out.print(String.valueOf(_i) + " " + String.valueOf(_j) + " ");
                        System.out.println(dp[_i][_j]);
                        maxSubseqLen = dp[_i][_j];
                        longest += s.charAt(i);
                    } won't work */

                }
                else {
                    dp[_i][_j] = Math.max(dp[_i-1][_j], dp[_i][_j-1]);
                }
            }
        }

        /* for (int[] i : dp){
            for (int j : i) {
                System.out.print(String.valueOf(j) + " ");;
            }
            System.out.println();
        } */

        // System.out.println(maxSubseqLen);
        // System.out.println(longest);

        int _i = sLen;
        int _j = tLen;

        Stack<Character> stak = new Stack<>();

        while (_i > 0 && _j > 0) {
            if (_i > 0 && dp[_i][_j] == dp[_i-1][_j]) {
                _i -= 1;
            }
            else if (_j > 0 && dp[_i][_j] == dp[_i][_j-1]) {
                _j -= 1;
            }
            /* letters at the end of both strings currently being
            compared are the same */
            else {
                stak.push(s.charAt(_i - 1));
                _i -= 1;
                _j -= 1;
            }
        }

        while (!stak.isEmpty()) {
            System.out.print(stak.pop());
        }

        System.out.println();
    }
}