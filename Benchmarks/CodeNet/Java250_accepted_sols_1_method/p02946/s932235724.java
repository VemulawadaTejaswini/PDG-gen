import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int K = in.nextInt();
        int X = in.nextInt();

        for (int i = Math.max(-1000000, X - K + 1); i <= Math.min(X + K - 1, 1000000); i++) {
            out.print(i);
            out.print(" ");
        }
    }
}
