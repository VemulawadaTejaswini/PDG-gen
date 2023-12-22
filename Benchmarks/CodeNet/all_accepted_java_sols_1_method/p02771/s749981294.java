import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		String kawaiso = "No";

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if (a == b && b == c) {

		} else {
			if (a == b || b == c || a == c) {
				kawaiso = "Yes";
			}
		}

		System.out.println(kawaiso);

	}

}