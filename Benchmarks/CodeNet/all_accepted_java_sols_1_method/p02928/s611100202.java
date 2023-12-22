import java.util.*;

public class Main {

    public static void main(String[] args) {
        int mod = 1_000_000_007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i] > a[j]){
                    if(i < j){
                        ans = (ans + k * (k+1) /2) % mod;
                    }else if(j < i){
                        ans = (ans + k * (k-1) /2) % mod;
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
