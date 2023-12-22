import java.util.*;

public class Main{

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int t=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(t+1==a)t+=1;
        }
        if(t==0)t=n+1;
        System.out.println(n-t);
    }
}
