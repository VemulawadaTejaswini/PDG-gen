import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();

		String str = "YES";

		str = ((a + b >= x) && (a <= x)) ? "YES" : "NO";

		System.out.println(str);

		scan.close();

	}

}
