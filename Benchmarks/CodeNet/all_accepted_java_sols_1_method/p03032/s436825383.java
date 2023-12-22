import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        long ans = Integer.MIN_VALUE;
        for (int i = 0; i <= Math.min(k, n); i++) {
            for (int j = 0; j <= i; j++) {
                List<Integer> list = new ArrayList<>();
                for (int l = 0; l < j; l++) {
                    list.add(v[l]);
                }
                for (int l = 0; l < i - j; l++) {
                    list.add(v[n - l - 1]);
                }
                Collections.sort(list);
                long sum = 0;
                int r = k - i;
                for (int l : list) {
                    if (l < 0 && r > 0) {
                        r--;
                    } else {
                        sum += l;
                    }
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}