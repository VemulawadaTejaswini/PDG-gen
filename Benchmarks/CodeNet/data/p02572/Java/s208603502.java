import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mod = (int)1e9 + 7;
        long[] sum = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum[i] = (i == 0 ? (long)arr[i] : (long)arr[i] + sum[i - 1]);
        }
        long res = 0;
        for(int i = 0; i < n; i++){
            res += (long)arr[i] * (sum[n - 1] - sum[i]);
            res %= mod;
        }
        System.out.println(res);
    }
}