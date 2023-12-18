import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String S;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            S = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        char a = S.charAt(0);
        char b = a;

        int ans = 0;

        for (int i = 0; i < S.length(); i++) {
            if (b != S.charAt(i)) ans++;
            b = S.charAt(i);
        }

        out.println(ans);

        out.flush();
    }
}
