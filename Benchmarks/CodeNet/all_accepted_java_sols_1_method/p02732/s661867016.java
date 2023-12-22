import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sums[arr[i]]++;
        }
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += sums[i] * (sums[i] - 1) / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long x = sums[arr[i]];
            long tmp = ans - x * (x - 1) / 2 + (x - 1) * (x - 2) / 2;
            sb.append(tmp).append("\n");
        }
        System.out.print(sb);
    }
}