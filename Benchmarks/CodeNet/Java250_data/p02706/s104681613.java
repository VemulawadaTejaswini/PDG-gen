import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int d = 0;

		for (int i = 0; i < b; i++) {
			int c = input.nextInt();
			d = a - c;
			a = d;
		}

		if (d < 0) {
			d = -1;
		}
		System.out.println(d);
	}
}