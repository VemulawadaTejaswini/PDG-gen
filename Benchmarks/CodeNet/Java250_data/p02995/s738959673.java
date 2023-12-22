import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		long a = sc.nextLong(), b = sc.nextLong(),c = sc.nextLong(),d = sc.nextLong();
		long cdivcnt = 0,ddivcnt = 0,cdboth = 0;
		cdivcnt = b/c;
		ddivcnt = b/d;
		cdboth = b/lcm(c,d,gcd(c,d));
		long bcnt = b - (cdivcnt + ddivcnt) + cdboth;
		
		cdivcnt = (a-1)/c;
		ddivcnt = (a-1)/d;
		cdboth = (a-1)/lcm(c,d,gcd(c,d));
		long acnt = (a-1) - (cdivcnt + ddivcnt) + cdboth;
		
		System.out.println(bcnt - acnt);
	}
	
	static long gcd(long a, long b) {
		if(a%b == 0) return b;
		return gcd(b,a%b);
	}
	
	static long lcm(long a,long b,long abgcd) {
		return a * b / abgcd;
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}



