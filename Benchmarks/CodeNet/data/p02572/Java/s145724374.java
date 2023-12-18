import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long mod = 1000000007;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        double ans = 0, count = 0;
        for(int i=0;i<n;i++){
            count+=arr[i];
        }
        for(int i=0;i<n;i++){
            ans += (count-arr[i])*arr[i];
            ans = ans%mod;
        }
        ans = ans/2;
        System.out.println((long)ans%mod);
    }
}