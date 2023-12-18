
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int ans = ans(i, j, k);
                    if (ans <= n) {
                        arr[ans] = arr[ans] + 6;
                    }
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ans = ans(i, i, j);
                if (ans <= n) {
                    arr[ans] = arr[ans] + 3;
                }
                ans = ans(i, j, j);
                if (ans <= n) {
                    arr[ans] = arr[ans] + 3;
                }
            }
        }


        for (int i = 1; i < n; i++) {
            int ans = ans(i, i, i);

            if (ans <= n) {
                arr[ans] = arr[ans] + 1;
            }
        }


        for (int i = 1; i <= n; i++) {
            out.println(arr[i]);
        }
        // out.println("Hello World");
        out.flush();
    }

    int ans(int x, int y, int z) {
        return x * x + y * y + z * z + x * y + y * z + z * x;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
