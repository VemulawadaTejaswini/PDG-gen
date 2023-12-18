import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextInt();

		int d = (int)(a/b);
		int r = (int)(a%b);
		float f = (float)(a/b);
		System.out.println(d+" "+r+" "+f);
	}
}