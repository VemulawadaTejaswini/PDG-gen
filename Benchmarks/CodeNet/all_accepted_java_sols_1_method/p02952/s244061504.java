import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int N = in.nextInt();

        int L = 1, R = 10;
        int result = 0;
        for (; R <= N; L *= 100, R *= 100) {
            result += R - L;
        }

        result += N - Math.min(L - 1, N);

        out.println(result);
    }
}
