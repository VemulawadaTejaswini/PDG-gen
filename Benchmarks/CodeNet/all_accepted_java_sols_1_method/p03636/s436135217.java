import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int l = s.length() - 1;
            int n = s.length() - 2;

            String ans = s.charAt(0) + String.valueOf(n) + s.charAt(l);
            System.out.println(ans);
        }
    }
}
