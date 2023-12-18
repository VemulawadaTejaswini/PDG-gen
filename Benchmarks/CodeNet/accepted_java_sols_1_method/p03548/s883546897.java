import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int X = Integer.parseInt(sl[0]);
            int Y = Integer.parseInt(sl[1]);
            int Z = Integer.parseInt(sl[2]);

            int ans = 0;
            for (int i = 0; i <= 100000; i++) {
                if (X < i * Y + (i + 1) * Z) break;
                ans = i;
            }

            System.out.println(ans);
        }
    }
}
