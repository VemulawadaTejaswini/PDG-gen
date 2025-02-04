import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            int x = Integer.parseInt(sl[0]);
            int a = Integer.parseInt(sl[1]);
            int b = Integer.parseInt(sl[2]);

            System.out.println(Math.abs(x - a) < Math.abs(x - b) ? 'A' : 'B');
        }
    }
}
