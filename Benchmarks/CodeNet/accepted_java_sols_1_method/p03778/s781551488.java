import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W, a, b;
		W = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		if(a <= b && b <= a + W || b <= a && a <= b + W) System.out.print(0);
		if(b > a + W) System.out.print(b - (a + W));
		if(a > b + W) System.out.print(a - (b + W));
	}
}