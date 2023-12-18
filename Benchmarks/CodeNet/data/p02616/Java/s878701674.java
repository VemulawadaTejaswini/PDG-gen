import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(helper(arr, n, k));
    }

    private static long helper(int[] arr, int n, int k) {
        long max = 1;
        int m = 1000000007;
        for (int i = 0; i < k; i++) {
            max *= arr[i];
            max %= m;
        }
        long prev = max;
        for (int i = 1; i <= n - k; i++) {
            long curr = (prev / arr[i - 1]) * arr[i + k - 1];
            curr %= m;
            max = Math.max(max, curr);
            prev = curr;
        }
        return (max + m) % m;
    }
}