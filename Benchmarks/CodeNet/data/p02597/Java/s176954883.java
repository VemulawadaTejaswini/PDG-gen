
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();

        String s = sc.next();

        int totalR = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') totalR++;
        }

        int countR = 0;
        for (int i = 0; i < totalR; i++) {
            if (s.charAt(i) == 'R') countR++;
        }
        System.out.println(totalR - countR);
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
