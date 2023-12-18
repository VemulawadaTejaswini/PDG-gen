
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i % d == 0) {
                count++;
            }
        }
        System.out.println(count);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
