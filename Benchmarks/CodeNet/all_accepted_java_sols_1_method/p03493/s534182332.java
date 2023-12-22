import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int ans = 0;

            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) == '1') {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
