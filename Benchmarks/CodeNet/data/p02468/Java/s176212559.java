import java.util.Scanner;

public class Main {
	private static Scanner sc;
	final static int mod=1000000007;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		long m=sc.nextInt();
		long n=sc.nextInt();
		System.out.println(modpow(m,n));
	}

	static long modpow(long x,long n){
		if(n==0){
			return 1;
		}else if(n%2==0){
			long ans=modpow(x,n/2);
			return ((ans%mod)*(ans%mod))%mod;
		}else{
			long ans=modpow(x,n-1);
			return ((x%mod)*(ans%mod))%mod;
		}
	}

}