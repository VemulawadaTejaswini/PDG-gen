import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, d, r;
		float f;
		a = sc.nextInt();
		b = sc.nextInt();
		d = a / b;
		r = a % b;
		f = a / b;
		System.out.println(d+" "+r+" "+f);
	}
}