import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();

		int AB=Math.abs(a-b);
		int AC=Math.abs(a-c);
		int BC=Math.abs(c-b);

		if (AC <= d) {
			System.out.println("Yes");
		} else if (AB <= d&&BC<=d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
