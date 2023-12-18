import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long res=0;
		long mod = 1000000007;
		long k = sc.nextLong();
		for(long i=k;i<=n+1;i++) {
			long left = (((i-1)*i))/2;
			long right = (((n+1)*n)/2)-((n+1-i)*(n-i)/2);
			res=(res+right-left+1);
			res=res%mod;
			left=0;
			right=0;
		}
		System.out.println(res);
	}
}