import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String result = "";

		for (int i = 0; i < 3000; i++) {
			String line = sc.nextLine();
			String[] n = line.split(" ");
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			if (a == 0 && b == 0) {
				break;
			} else if (a <= b) {
				System.out.println(a + " " + b);
			} else if (a > b) {
				System.out.println(b + " " + a);
			}

		}

	}

}
