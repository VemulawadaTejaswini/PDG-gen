import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;
        final String t;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
            t = reader.readLine();
        }

        final String[] sl = s.split(" ");
        double N = Integer.parseInt(sl[0]);
        double K = Integer.parseInt(sl[1]);

        System.out.println((int)Math.ceil((N - 1) / (K - 1)));
    }
}
