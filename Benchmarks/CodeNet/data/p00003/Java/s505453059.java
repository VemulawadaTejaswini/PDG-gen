public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int count = scan.nextInt();
		while (0 <= --count) {
			double a, b, c;
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			print(a * a + b * b == c * c ? "YES" : "NO");
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}