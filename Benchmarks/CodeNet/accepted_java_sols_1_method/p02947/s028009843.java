import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();
        Map<String, Integer> found = new HashMap<>();

        long result = 0;
        for (int i = 0; i < N; i++) {
            String input = in.next();
            String data = new String(input.chars().sorted().toArray(), 0, input.length());

            result += found.merge(data, 1, (x, y) -> x + y) - 1;
        }

        out.println(result);
    }
}
