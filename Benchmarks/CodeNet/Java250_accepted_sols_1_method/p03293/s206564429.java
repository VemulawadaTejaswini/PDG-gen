import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            StringBuilder S = new StringBuilder(reader.readLine());
            final String T = reader.readLine();

            boolean flg = false;
            for (int i = 0; i < S.length(); i++) {
                if (T.contentEquals(S)) {
                    flg = true;
                    break;
                }
                S = S.insert(0, S.charAt(S.length() - 1));
                S.setLength(S.length() - 1);
            }

            System.out.println(flg ? "Yes" : "No");
        }
    }
}
