import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		a = (int)(Math.ceil(a/c));
		b = (int)(Math.ceil(b/d));
		System.out.println(l - (int)Math.max(a, b));
		sc.close();
	}

}