import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String S;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            S = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final int MAX_S = S.length();
        final int MAX_POS = (int)Math.pow(2, MAX_S) - 1;

        long ans = 0;

        for (int i = (int)Math.pow(2, MAX_S - 1); i <= MAX_POS; i++) {
            int pos = 0;

            for (int j = 0; j < MAX_S; j++) {
                if ((i >> j & 1) == 1) {
                    long tmp = Long.parseLong(S.substring(pos, j + 1));
                    pos = j + 1;
                    ans += tmp;
                }
            }
        }

        out.println(ans);

        out.flush();
    }
}
