import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		sc.close();
		
		long gcdVal = gcd(a,b);
		System.out.println(a*b/gcdVal);
		
	}
	
	public long gcd(long a, long b) {

		if(a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		while(b % a != 0) {
			
			long tmp = a;
			a = b % a;
			b = tmp;
		}
		
		return a;
	}
}
