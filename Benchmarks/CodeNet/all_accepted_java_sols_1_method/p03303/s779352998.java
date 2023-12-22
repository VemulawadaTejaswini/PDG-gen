
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] a = sc.next().toCharArray();
        int w = sc.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            if (i % w == 0) so.print(a[i]);
        }
    }
}
