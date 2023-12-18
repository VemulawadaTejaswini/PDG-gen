import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),m=1000000000+7;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        long ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=((ans%m)+(arr[i]*arr[j])%m)%m;
            }
        }
        System.out.println(ans);
    }
}