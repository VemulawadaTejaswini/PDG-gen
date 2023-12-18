import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long n = sc.nextLong();
        int[] m = new int[100];
        Arrays.fill(m, -1);

        for (int i = 1; i < 100; i++) {
            m[i] = (int) (n % 26);
            if (m[i] == 0)
                m[i] = 26;
            n = (n - m[i]) / 26;
            if (n == 0) {
                break;
            }
        }

        for (int i = 99; i > 0; i--) {
            if (m[i] == -1)
                continue;
            System.out.print((char) ('a' + m[i] - 1));
        }
        System.out.println("");
    }
}
