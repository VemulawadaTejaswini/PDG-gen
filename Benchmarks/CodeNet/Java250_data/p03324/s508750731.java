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
            Double D = Double.parseDouble(sl[0]);
            int N = Integer.parseInt(sl[1]);

            if (N == 100) N += 1;

            System.out.println((int)(N * Math.pow(100d, D)));
        }
    }
}
