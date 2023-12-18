import java.util.*;
public class Main {
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static long fac(long x){
        if(x==0) return 1;
        return x*fac(x-1);
    }
    public static long per(long x,long y){
        return fac(x)/fac(x-y);      
    }
    public static long com(long x,long y){
        return per(x,y)/fac(y);      
    }
   
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        long ans = 0;
		long mod = 1000000007;
        for(int i=0;i<k;i++){ans+=Math.pow(26,a)%mod;
                            ans%=mod;}
        System.out.println(ans);
	}
}
