
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long input = in.nextLong();

        long round = input / 11;
        long mod = input % 11;

        long result = round * 2;

        if (0 < mod) {
            result++;
        }
        if (6 < mod) {
            result++;
        }

        out.print(result);
    }
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
}
