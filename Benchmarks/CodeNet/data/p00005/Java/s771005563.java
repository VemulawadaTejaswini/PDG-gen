public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = 1;
		int b = 1;
		while ( sc.hasNext() ) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println( gcd(a, b) + " " + lcm(a, b) );
		}
	}

	public static int gcd(int a, int b) {
		int r;
		int max = Math.max(a, b);
		int mini = Math.min(a, b);
		do {
			r = max % mini; // max = q*mini + r , mini > r
			max = mini;
			mini = r;
		} while (r != 0);
		return max;
	}

	public static int lcm(int a, int b) {
		int d = gcd(a, b);
		return a/d * b;
	}
}