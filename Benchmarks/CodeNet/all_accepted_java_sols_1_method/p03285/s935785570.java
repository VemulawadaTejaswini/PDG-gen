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

            boolean flg = false;
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    if (N == 4 * i + 7 * j) {
                        flg = true;
                        break;
                    }
                }
            }

            System.out.println(flg ? "Yes" : "No");
        }
    }
}
