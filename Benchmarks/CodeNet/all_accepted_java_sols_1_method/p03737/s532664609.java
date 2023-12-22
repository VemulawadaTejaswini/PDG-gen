import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            String s1 = sl[0];
            String s2 = sl[1];
            String s3 = sl[2];

            String ans = String.format("%c", s1.charAt(0) - 32);
            ans += String.format("%c", s2.charAt(0) - 32);
            ans += String.format("%c", s3.charAt(0) - 32);
            System.out.println(ans);
        }
    }
}
