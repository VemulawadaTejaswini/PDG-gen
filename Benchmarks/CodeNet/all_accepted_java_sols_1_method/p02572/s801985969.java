import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mod = (int)1e9 + 7;
        long sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = 0;
        for(int i = n - 1; i >= 0; i--){
            res += arr[i] * sum;
            sum += (long)arr[i];
            sum %= mod;
            res %= mod;
        }
        System.out.println(res);
    }
}