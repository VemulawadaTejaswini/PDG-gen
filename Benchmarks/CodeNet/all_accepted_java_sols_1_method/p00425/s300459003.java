import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = "North:South:East:West:Right:Left".split(":");
        int[][] l = { { 0, 1, 1, 2, 2, 3 }, { 3, 2, 2, 1, 1, 0 }, { 0, 5, 2, 4, 4, 5 }, { 0, 4, 2, 5, 5, 4 }, { 1, 4, 3, 5, 4, 5 }, { 1, 5, 3, 4, 4, 5 } };
        Map<String, int[]> m = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            m.put(s[i], l[i]);
        }
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 1;
            int[] d = { 1, 2, 6, 5, 3, 4 };
            while (n-- > 0) {
                int[] t = m.get(sc.next());
                for (int i = 0; i < t.length; i += 2) {
                    int p = d[t[i]];
                    d[t[i]] = d[t[i + 1]];
                    d[t[i + 1]] = p;
                }
                sum += d[0];
            }
            System.out.println(sum);
        }

    }
}

