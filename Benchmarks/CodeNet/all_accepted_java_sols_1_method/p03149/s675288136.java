
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next() + sc.next() + sc.next() + sc.next();
        if (s.contains("1") && s.contains("9") && s.contains("7") && s.contains("4")) {
            so.println("YES");
        } else {
            so.println("NO");
        }
    }
}
