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

            int a = Integer.parseInt(sl[0]);
            int b = Integer.parseInt(sl[1]);

            System.out.println(a * b % 2 == 0 ? "Even" : "Odd");
        }
    }
}
