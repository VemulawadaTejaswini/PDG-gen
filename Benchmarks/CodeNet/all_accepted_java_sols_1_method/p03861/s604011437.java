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
            long a = Long.parseLong(sl[0]);
            long b = Long.parseLong(sl[1]);
            long x = Long.parseLong(sl[2]);

            long ad = a / x;
            if (a % x != 0) ad++;

            long bd = b / x;

            System.out.println(b < ad * x ? 0 : bd - ad + 1);
        }
    }
}
