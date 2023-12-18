import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double EPS = 1.0e-10;
    final int INF = 1 << 28;
    boolean used[];
    int nums[];
    String[] strs;
    String[] cs;
    int ans;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            strs = new String[n];
            Set<String> set = new HashSet<String>();
            for (int i = 0; i < n; i++) {
                strs[i] = sc.next();
                String[] tmp = strs[i].split("\\B");
                for (int j = 0; j < tmp.length; j++) {
                    set.add(tmp[j]);
                }
            }
            cs = new String[set.size()];
            cs = set.toArray(cs);
            nums = new int[cs.length];
            used = new boolean[10];
            ans = 0;
            permutation(0, 9, cs.length);
            System.out.println(ans);
        }
    }

    void permutation(int pos, int n, int k) {
        if (pos == k) {
            int sum = 0;
            String[] rstrs = new String[strs.length];
            for (int i = 0; i < strs.length; i++) {
                rstrs[i] = strs[i];
            }
            for (int i = 0; i < strs.length; i++) {
                for (int j = 0; j < cs.length; j++) {
                    rstrs[i] = rstrs[i].replace(cs[j],
                            Integer.toString(nums[j]));
                }
                if (rstrs[i].charAt(0) == '0') {
                    return;
                }
            }
            for (int i = 0; i < rstrs.length - 1; i++) {
                sum += Integer.parseInt(rstrs[i]);
            }
            if (sum == Integer.parseInt(rstrs[rstrs.length - 1]))
                ans++;
            return;
        }

        for (int i = 0; i <= n; i++) {
            if (used[i])
                continue;
            nums[pos] = i;
            used[i] = true;
            permutation(pos + 1, n, k);
            used[i] = false;
        }
        return;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}