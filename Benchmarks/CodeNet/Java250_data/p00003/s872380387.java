import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int[] lengths = { scanner.nextInt(), scanner.nextInt(),
                    scanner.nextInt() };
            Arrays.sort(lengths);
            String result = lengths[0] * lengths[0] + lengths[1] * lengths[1] == lengths[2]
                    * lengths[2] ? "YES" : "NO";
            out.println(result);
        }
    }
}