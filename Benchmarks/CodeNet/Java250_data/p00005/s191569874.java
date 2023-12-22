import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);
	StringTokenizer st;
	
	long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	
	
	void run() {
		long a, b;
		while (sc.hasNextLine()) {
			st = new StringTokenizer(sc.nextLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			System.out.printf("%d %d\n", gcd(a,b), a*b/gcd(a,b));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}