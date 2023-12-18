import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String S = reader.readLine();

            final int alp = 26;

            boolean[] x = new boolean[alp];

            Arrays.fill(x, false);

            boolean flg = true;

            for (int i = 0; i < S.length(); i++) {
                if (x[S.charAt(i) - 'a']) {
                    flg = false;
                    break;
                }

                x[S.charAt(i) - 'a'] = true;
            }

            System.out.println(flg ? "yes" : "no");
        }
    }
}
