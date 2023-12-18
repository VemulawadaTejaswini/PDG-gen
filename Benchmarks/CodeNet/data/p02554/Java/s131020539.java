import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		long ten = 1;
		long kaizyo = 1;
		long mod = 1000000007;
		
		for(int i=1;i<=n-2;i++) {
			ten = (ten*10)%mod;
		}
		
		for(int i=1;i<=n;i++) {
			kaizyo = (kaizyo*i)%mod;
		}
		
		if(n==1) {
			System.out.println(0);
		}else if(n==2) {
			System.out.println(2);
		}else {
			System.out.println((kaizyo*ten)%mod);
		}
		
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
	
}
 



