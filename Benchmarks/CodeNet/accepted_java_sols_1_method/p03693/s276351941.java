import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();

            s = s.replace(" ", "");

            int x = Integer.parseInt(s);

            System.out.println(
                x % 4 == 0 ? "YES" : "NO");
        }
    }
}
