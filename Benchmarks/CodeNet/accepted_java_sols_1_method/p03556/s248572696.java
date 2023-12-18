import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int N = Integer.parseInt(s);

            int ans = 0;

            for (int i = 0; i <= N; i++) {
                int i2 = i * i;
                if (N < i2) break;
                ans = i2;
            }

            System.out.println(ans);
        }
    }
}
