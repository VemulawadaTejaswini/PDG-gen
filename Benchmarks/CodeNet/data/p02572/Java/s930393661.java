import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(sc.next());
            sum = sum+a[i];
        }
        
        long ans = 0;
        for(int i=0; i<n-1; i++) {
            sum = sum-a[i];
            ans = (ans+(a[i]*sum)) % 1000000007;
        }
        System.out.println(ans);
    }
}
