import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long ans = 0;
		
		for(int i=1; i<n+1; i++) {
			for(int j=i; j<n+1; j++) {
				for(int k=j; k<n+1; k++) {
					if(i == j && j == k) {
						ans += gcd(i,j,k);
					}else if(i != j && j!= k) {
						ans += 6 * gcd(i,j,k);
					}else {
						ans += 3 * gcd(i,j,k);
					}
				}
			}
		}
		
		System.out.println(ans);

	}
	
	static long gcd(int a, int b, int c) {
		if(a == b && b == c) {
			return a;
		}
		return gcd(gcd(a,b),c);
	}
	
	static long gcd(long a, long b) {
		while(true) {
			if(a==b) {
				return a;
			}
			if(a>b) {
				a %= b;
				if(a==0) return b;
			}else {
				b %= a;
				if(b==0) return a;
			}
		}
	}

}
