import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        long N = Long.parseLong(sl[0]);
        long M = Long.parseLong(sl[1]);

        if (M < N) {
            long tmp = N;
            N = M;
            M = tmp;
        }

        if (N == 1) {
            if (M == 1) out.println(1);
            else out.println(M - 2);
        } else
            out.println((N - 2) * (M - 2));

        out.flush();
    }
}
