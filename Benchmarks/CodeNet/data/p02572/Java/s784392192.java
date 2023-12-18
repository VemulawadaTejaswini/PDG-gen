import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long s=0,ans=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); s+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            s=(s-a[i])%1000000007;
            ans=(ans+s*a[i])%1000000007;
        }
        System.out.println(ans%1000000007);

    }
}