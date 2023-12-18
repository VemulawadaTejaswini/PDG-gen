import java.io.PrintStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int result = 0;
            for (int a = 0; a < 10; a++) {
                if (a > n) {
                    break;
                }
                for (int b = 0; b < 10; b++) {
                    int ab = a + b;
                    if (ab > n) {
                        break;
                    }
                    for (int c = 0; c < 10; c++) {
                        int abc = ab + c;
                        if (abc > n) {
                            break;
                        }
                        for (int d = 0; d < 10; d++) {
                            if (abc + d == n) {
                                result++;
                                break;
                            }
                        }
                    }
                }
            }
            out.println(result);
        }
    }
}