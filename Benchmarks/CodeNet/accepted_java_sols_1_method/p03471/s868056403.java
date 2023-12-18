import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int Y = sc.nextInt();
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N-x; y++) {
                int z = N -(x+y);
                int amount = 10000*x + 5000*y + 1000*z;
                if (amount == Y) {
                    so.println(x + " " + y + " " + z);
                    return;
                }
            }
        }
        
        so.println("-1 -1 -1");
    }
}
