import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long res = -(long)Math.pow(10, 18);
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt() - 1;
        }
        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = i;
            long tot = 0;
            List<Integer> list = new ArrayList<>();
            while (true) {
                x = p[x];
                list.add(c[x]);
                tot += c[x];
                if (x == i) {
                    break;
                }
            }
            int l = list.size();
            long t = 0;
            for (int j = 0; j < l; j++) {
                t += list.get(j);
                long now = t;
                if (j + 1 > k) {
                    break;
                }
                if (tot > 0) {
                    int e = (k - (j + 1)) / l;
                    now += tot * e;
                }
                res = Math.max(res, now);
            }
        }
        System.out.println(res);
        sc.close();
    }
}