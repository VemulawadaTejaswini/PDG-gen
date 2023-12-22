import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long a = scan.nextInt();
			long b = scan.nextInt();
			
			long gcd = gcd(a, b);
			long lcm = a * b / gcd;
			System.out.println(gcd + " " + lcm);
		}
	}
	
	private long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}

}