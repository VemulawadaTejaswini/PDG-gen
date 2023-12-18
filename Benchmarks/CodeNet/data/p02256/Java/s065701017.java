import java.util.*;
import java.lang.Math;
public class Main{
    public static long LCM(long a,long b){
        if(a==0 || b==0) return 0;
        long tmp;
        long r;
        long x;
        x=a*b;
        if(a<b){
            tmp=a;
            a=b;
            b=tmp;
        }
        r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        x=x/b;
        return x;
      }
    public static long GCD(long a,long b){
        if(a==0 || b==0) return Math.max(a,b);
        else return (a*b)/LCM(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(GCD(a,b));
    }
}
