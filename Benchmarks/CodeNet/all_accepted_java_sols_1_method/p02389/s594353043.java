import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		int area = a * b;
		int around = 2 * (a + b);

		System.out.print(area + " ");
		System.out.println(around);

	}
}