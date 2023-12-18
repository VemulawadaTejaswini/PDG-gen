import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// double pi = Math.PI;
		// double a = r * r * pi;
		// double b = r * 2 * pi;
		if (a == b)
			System.out.println(a + " == " + b);
		else if (a > b)
			System.out.println(a + " > " + b);
		else
			System.out.println(a + " < " + b);
		// System.out.printf("%f %f", a, b);
		sc.close();
	}
}