import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");

            final Integer[] x = new Integer[sl.length];
            x[0] = Integer.parseInt(sl[0]);
            x[1] = Integer.parseInt(sl[1]);
            x[2] = Integer.parseInt(sl[2]);
            Arrays.sort(x);

            System.out.println(x[0] + x[1] == x[2] ? "Yes" : "No");
        }
    }
}
