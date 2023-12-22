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
            final String s = reader.readLine();

            int atA = 200001;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    atA = i;
                    break;
                }
            }

            int atZ = -1;

            for (int i = s.length() - 1; 0 <= i; i--) {
                if (s.charAt(i) == 'Z') {
                    atZ = i;
                    break;
                }
            }

            System.out.println(atZ - atA + 1);
        }
    }
}
