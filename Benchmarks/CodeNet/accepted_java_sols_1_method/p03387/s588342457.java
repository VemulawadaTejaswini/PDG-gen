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
        int A = Integer.parseInt(sl[0]);
        int B = Integer.parseInt(sl[1]);
        int C = Integer.parseInt(sl[2]);

        int max = Math.max(A, Math.max(B, C));

        int sum = 3 * max - A - B - C;

        int ans;

        if (sum % 2 == 0) ans = sum / 2;
        else ans = (int)Math.ceil((double)sum / 2) + 1;

        out.println(ans);

        out.flush();
    }
}
