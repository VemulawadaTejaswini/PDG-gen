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
        int D = Integer.parseInt(sl[0]);

        out.println(D == 25 ? "Christmas"
                    : D == 24 ? "Christmas Eve"
                    : D == 23 ? "Christmas Eve Eve"
                    : "Christmas Eve Eve Eve");

        out.flush();
    }
}
