import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long mod = 1000000000+7;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        long ans = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ans+=(arr[i]*arr[j])%mod;
                ans = ans%mod;
            }
        }
        System.out.println(ans);
    }
}