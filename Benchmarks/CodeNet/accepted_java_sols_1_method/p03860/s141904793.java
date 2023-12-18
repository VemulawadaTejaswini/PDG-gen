import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            String ans;
            final String[] sl = s.split(" ");
            ans = String.format("%c", sl[0].charAt(0));
            ans += String.format("%c", sl[1].charAt(0));
            ans += String.format("%c", sl[2].charAt(0));

            System.out.println(ans);
        }
    }
}
