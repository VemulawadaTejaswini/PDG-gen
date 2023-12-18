public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = Math.PI;
		int r = sc.nextInt();
		double a = r*r*PI;
		double b = 2*r*PI;
		System.out.println(a + " " + b);
	}
}