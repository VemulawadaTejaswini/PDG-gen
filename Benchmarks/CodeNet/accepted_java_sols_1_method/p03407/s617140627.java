import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);
            int C = Integer.parseInt(sl[2]);

            System.out.println(C <= A + B ? "Yes" : "No");
        }
    }
}
