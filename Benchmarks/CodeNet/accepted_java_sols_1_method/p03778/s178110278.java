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
            int W = Integer.parseInt(sl[0]);
            int a = Integer.parseInt(sl[1]);
            int b = Integer.parseInt(sl[2]);

            int ans = 0;
            if (a + W < b) ans = b - a - W;
            if (b + W < a) ans = a - b - W;

            System.out.println(ans);
        }
    }
}
