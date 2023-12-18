import java.math.BigInteger;
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

    private static int helper(int[] arr, int n, int k) {
        BigInteger max = BigInteger.valueOf(1);
        BigInteger m = BigInteger.valueOf(1000000007);
        for (int i = 0; i < k; i++) {
            max = max.multiply(BigInteger.valueOf(arr[i]));
        }
        BigInteger prev = max;
        for (int i = 1; i <= n - k; i++) {
            BigInteger curr = (prev.divide(BigInteger.valueOf(arr[i - 1]))
                    .multiply(BigInteger.valueOf(arr[i + k - 1])));
            max = max.max(curr);
            prev = curr;
        }
        return max.add(m).mod(m).intValue();

    }
}