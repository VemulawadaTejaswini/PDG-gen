import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();

            s = s.replace(" ", "");

            final int x = Integer.parseInt(s);

            boolean flg = false;
            for (int i = 2; i <= x; i++) {
                int i2 = i * i;
                if (x < i2) break;
                if (x == i2) {
                    flg = true;
                    break;
                }
            }

            System.out.println(flg ? "Yes" : "No");
        }
    }
}
