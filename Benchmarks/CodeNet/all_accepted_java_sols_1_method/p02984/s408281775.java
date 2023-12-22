import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                total += arr[i];
            } else {
                total -= arr[i];
            }
        }
        long[] ans = new long[n];
        ans[0] = total;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                total -= arr[i] * 2;
                ans[i + 1] = -total;
            } else {
                total += arr[i] * 2;
                ans[i + 1] = total;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(ans[i]);
        }
        System.out.println(sb);
    }
    
}