import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            HashSet<Integer> g1 =
                new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

            HashSet<Integer> g2 =
                new HashSet<Integer>(Arrays.asList(4, 6, 9, 11));

            HashSet<Integer> g3 =
                new HashSet<Integer>(Arrays.asList(2));

            final String sl[] = s.split(" ");
            int x = Integer.parseInt(sl[0]);
            int y = Integer.parseInt(sl[1]);

            if ((g1.contains(x) && g1.contains(y))
                || (g2.contains(x) && g2.contains(y))
                || (g3.contains(x) && g3.contains(y))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
