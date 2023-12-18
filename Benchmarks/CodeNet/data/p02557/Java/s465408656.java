
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> l = new ArrayList<>();
        int[] ans = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int m = l.size();
            boolean outer = false;
            for (int j = 0; j < m; j++) {
                int b = l.get(j);
                if (a != b) {
                    l.remove(j);
                    ans[i] = b;
                    outer = true;
                    break;
                }
            }
            if (outer) {
                continue;
            }
            if (cur >= n) {
                break;
            }
            int b = arr2[cur];
            cur++;

            while (a == b) {
//                debug(b);
                l.add(b);
                if (cur >= n) {
                    outer = true;
                    break;
                }
                b = arr2[cur];
                cur++;
            }
            if (outer) {
                break;
            }
            ans[i] = b;
        }
        if (!l.isEmpty()) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        out.print(ans[0]);
        for (int i = 1; i < n; i++) {
            out.print(" ");
            out.print(ans[i]);
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
