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

        long x = Long.parseLong(s);

        long base = 2 * (x / 11);

        long mod = x % 11;

        out.println(
            mod == 0 ? base :
            mod <= 6 ? base + 1 : base + 2);

        out.flush();
    }
}
