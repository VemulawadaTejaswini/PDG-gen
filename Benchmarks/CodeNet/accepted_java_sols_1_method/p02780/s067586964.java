import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        double[] p=new double[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        double [] e=new double[n+1];
        double res=0;
        for(int i=1;i<=n;i++)
        {
            e[i]=e[i-1]+(1+p[i-1])/2;
        }
        for(int i=k;i<=n;i++)
        {
            res=Math.max(res,e[i]-e[i-k]);
        }
        System.out.println(res);
    }
}