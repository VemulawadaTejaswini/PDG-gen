import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int N = Integer.parseInt(s);

            int mx = 0;
            int x = 0;
            for (int i = 1; i <= N; i++) {
                int t = i;
                int c = 0;
                while (0 < t) {
                    if ((t & 1) == 1) break;
                    t = t >> 1;
                    c++;
                }
                if (mx <= c) {
                    mx = c;
                    x = i;
                }
            }

            System.out.println(x);
        }
    }
}
