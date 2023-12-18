import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        out.println(Math.max(0, B + C - A));
    }
}
