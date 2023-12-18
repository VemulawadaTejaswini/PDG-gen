import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0 ; i < k ; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < k ; i++) {
            for (int j = l[i] ; j <= r[i] ; j++) {
                list.add(j);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            a[i] = list.get(i);
        }
        Arrays.sort(a);

        long dp[] = new long[n + 3];
        dp[0] = 1;
        int mod = 998244353;

        for (int i = 1 ; i < n + 2 ; i++) {
            for (int j = 0 ; j < a.length ; j++) {
                if (a[j] > i) break;
                dp[i] += dp[i - a[j]];
                dp[i] %= mod;
            }
        }

        System.out.println(dp[n - 1]);


    }

}