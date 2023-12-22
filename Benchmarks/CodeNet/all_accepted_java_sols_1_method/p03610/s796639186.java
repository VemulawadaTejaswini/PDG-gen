import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += 2) sb.append(s.charAt(i));

            System.out.println(sb.toString());
        }
    }
}
