import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);
            int C = Integer.parseInt(sl[2]);

            Integer[] X = new Integer[3];

            X[0] = A;
            X[1] = B;
            X[2] = C;

            Arrays.sort(X, Comparator.reverseOrder());

            System.out.println(X[0] * 10 + X[1] + X[2]);
        }
    }
}
