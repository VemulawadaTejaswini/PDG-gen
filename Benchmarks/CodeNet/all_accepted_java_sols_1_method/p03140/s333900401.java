
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ai = a.charAt(i);
            char bi = b.charAt(i);
            char ci = c.charAt(i);
            if (ai == bi && bi == ci) {
                // do nothing
            } else if (ai != bi && bi != ci && ci != ai) {
                count += 2;
            } else {
                count += 1;
            }
        }
        so.println(count);
    }
}
