import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        int N = Integer.parseInt(s);

        StringBuilder sb = new StringBuilder();

        while (0 != N) {
            if (Math.abs(N % 2) == 1) {
                sb.insert(0, "1");
                N -= 1;
            } else {
                sb.insert(0, "0");
            }

            N /= -2;
        }

        if (sb.length() == 0) sb.append("0");

        System.out.println(sb);
    }
}
