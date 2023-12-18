import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);

            A = A == 1 ? 14 : A;
            B = B == 1 ? 14 : B;

            System.out.println(A < B ? "Bob" : B < A ? "Alice" : "Draw");
        }
    }
}
