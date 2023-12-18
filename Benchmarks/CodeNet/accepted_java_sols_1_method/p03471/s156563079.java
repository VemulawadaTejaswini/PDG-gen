import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int N = Integer.parseInt(sl[0]);
        int Y = Integer.parseInt(sl[1]);

        boolean flg = false;
        for (int i = 0; i <= N; i++)  {
            for (int j = 0; i + j <= N; j++) {
                int k = N - i - j;
                if (Y == 10000 * i + 5000 * j + 1000 * k) {
                    out.println(i + " " + j + " " + k);
                    flg = true;
                    break;
                }
            }
            if (flg) break;
        }

        if (!flg) out.println("-1 -1 -1");

        out.flush();
    }
}
