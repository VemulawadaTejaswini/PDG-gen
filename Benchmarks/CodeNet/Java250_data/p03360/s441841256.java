import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();

            final String[] sl = s.split(" ");

            s = reader.readLine();
            int K = Integer.parseInt(s);

            int mx = 0;
            int sm = 0;
            for (int i = 0; i < sl.length; i++) {
                int tmp = Integer.parseInt(sl[i]);
                if (mx < tmp) mx = tmp;
                sm += tmp;
            }

            System.out.println(sm - mx + (int)Math.pow(2, K) * mx);
        }
    }
}
