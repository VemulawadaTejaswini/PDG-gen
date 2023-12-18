import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
        int n=sc.nextInt();
        if(n==0) break;
        double[] a=new double[n];
        double ave=0.0000000000;
        double sum=0.0000000000;
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            sum+=a[i];
        }
        ave=(double)sum/n;
        double ans=0.0000000;
        for(int i=0;i<n;i++){
            ans+=(double)(a[i]-ave)*(a[i]-ave);
        }
        ans=(double)ans/n;
        ans=(double)Math.sqrt(ans);
        System.out.println(ans);
    }
    }
}
