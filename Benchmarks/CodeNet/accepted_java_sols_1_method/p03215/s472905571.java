import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.parallelPrefix(a, Long::sum);
        List<Long> list = new ArrayList<>();
        long highest = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                highest = Math.max(highest, Long.highestOneBit(a[j] - a[i]));
                list.add(a[j] - a[i]);
            }
        }
        long ans = 0;
        for (long i = highest; i > 0; i /= 2) {
            List<Long> newList = new ArrayList<>();
            for (long j : list) {
                if ((j & i) == i) {
                    newList.add(j);
                }
            }
            if (newList.size() >= k) {
                ans += i;
                list = newList;
            }
        }

        System.out.println(ans);
    }
}