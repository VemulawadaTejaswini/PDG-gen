import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        while(true) {
            int n = in.nextInt();
            int m = in.nextInt();

            if (n == 0 && m == 0)
                break;
            in.nextLine();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);

            int ans = -1;

            for (int i = 0; i < a.length; i++) {
                int item = a[i];
                if (m - item <= 0)
                    break;

                int index = Arrays.binarySearch(a, m - item);
                // out.println("i: " + i + ", index: " + index);
                if (index >= 0 && index != i) {
                    ans = m;
                    break;
                } else {
                    index = ~index - 1;
                    if (index < 0 || index == i)
                        continue;
                    ans = Math.max(ans, item + a[index]);
                }
            }

            out.println(ans == -1 ? "NONE" : ans);
        }
    }

}

