import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();

		int max = a;
		String str = "a";
		if (max < b) {
			max = b;
			str = "b";
		}
		if (max < c) {
			max = c;
			str = "c";
		}

		for (int i = 0; i < k; i++) {
			max = max * 2;
		}

		if (str.equals("a")) {
			System.out.print(max + b + c);
		} else if (str.equals("b")) {
			System.out.print(a + max + c);
		} else {
			System.out.print(a + b + max);
		}

	}

}
