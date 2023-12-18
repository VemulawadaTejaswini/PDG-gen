import java.io.PrintStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        int n = scanner.nextInt();
        double debt = 100000.0;
        for (int i = 0; i < n; i++) {
            debt = Math.ceil(debt * 1.05 / 1000.0) * 1000.0;
        }
        out.println(String.format("%d\n", (long) debt));
    }
}