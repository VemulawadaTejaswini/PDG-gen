import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b = sca.nextInt();
		int c = sca.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;

		temp = a;
		a = c;
		c = temp;
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.print(c);
		System.out.println("");

		// 後始末
		sca.close();
	}
}