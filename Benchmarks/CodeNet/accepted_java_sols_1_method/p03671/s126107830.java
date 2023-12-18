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

            final String sl[] = s.split(" ");
            final int num = sl.length;

            int a[] = new int[num];

            for (int i = 0; i < num; i++) {
                a[i] = Integer.parseInt(sl[i]);
            }

            Arrays.sort(a);

            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}
