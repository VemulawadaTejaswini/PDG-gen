import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b;
		int d, r;
		float f;
		a = sc.nextInt();
		b = sc.nextInt();
		d = (int) (a / b);
		r = (int) (a % b);
		f = a / b;
		System.out.println(d+" "+r+" "+f);
	}
}