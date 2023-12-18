
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        String s = sc.next();
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') m++;
        }

        int[] maArr = new int[n + 1];
        int[] mbArr = new int[n + 1];
        maArr[0] = 1;
        mbArr[0] = 1;
        // 2のi乗の累積
        for (int i = 0; i < n; i++) {
            maArr[i + 1] = (maArr[i] * 2) % (m + 1);
            mbArr[i + 1] = (mbArr[i] * 2) % (m - 1);
        }

        int maMod = 0;
        int mbMod = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                maMod = (maMod + maArr[n - i - 1]) % (m + 1);
                mbMod = (mbMod + mbArr[n - i - 1]) % (m - 1);
            }
        }

        int[] modArr = new int[m + 1];

        for (int bit = 1; bit < m + 1; bit++) {
            int count = 0;
            for (int i = 0; i < 18; i++) {
                if ((bit & (1 << i)) != 0) {
                    count++;
                }
            }
//            debug(bit, count);
            int index = bit % count;
            modArr[bit] = modArr[index] + 1;
        }

//        debug(modArr);

        for (int i = 0; i < n; i++) {
            int index;
            if (s.charAt(i) == '0') {
                index = (maMod + maArr[n - i - 1]) % (m + 1);
            } else {
                index = (mbMod - mbArr[n - i - 1] + (m - 1)) % (m - 1);
            }
            out.println(modArr[index] + 1);
        }

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
