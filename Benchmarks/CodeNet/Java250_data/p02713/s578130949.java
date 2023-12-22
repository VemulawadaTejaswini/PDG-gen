import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		long ans=0L;

		for(int i=1;i<=K;i++) {
			for(int j=1;j<=K;j++) {
				for(int k=1;k<=K;k++) {
					long res= gcd(i,j);
					ans+=gcd(res,k);
				}
			}
		}
		System.out.println(ans);
	}
	public static long gcd(long a, long b) {
		if(a<b) {
			return gcd(b,a);
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}