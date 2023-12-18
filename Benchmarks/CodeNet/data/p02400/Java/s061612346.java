public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			double pi = Math.PI;
			double r = sc.nextInt();
			double a = 0;
			double b = 0;

			a = pi * r * r;
			b = 2 * pi * r;
			System.out.println(a + " " + b);
	}
}