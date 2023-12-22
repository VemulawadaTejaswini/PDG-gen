import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=1000000000+7;
        long arr[]=new long[n];
        long sum[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        sum[n-1]=0;
        sum[n-2]=arr[n-1];
        for(int i=n-3;i>=0;i--)
            sum[i]=arr[i+1]+sum[i+1];
            
        long ans=0;
        
        for(int i=0;i<n;i++){
            ans=(ans%m)+((arr[i]%m)*(sum[i]%m));
        }
        System.out.println(ans);
    }
}