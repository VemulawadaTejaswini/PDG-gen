import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long k = sc.nextLong();
            
        ps.println((k % 2 == 0) ? a-b : b-a);
    }
}