import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long mod = 1000000007;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        long ans = 0, count = 0;
        for(int i=0;i<n;i++){
            ans+=arr[i];
            count+=(Math.pow(arr[i],2));
            
        }
        ans = (long)(Math.pow(ans, 2) - count);
        ans = ((long)Math.floor(ans/2))%mod;
        System.out.println(ans);
    }
}