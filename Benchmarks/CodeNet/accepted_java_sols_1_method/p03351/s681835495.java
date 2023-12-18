import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int ac = a-c;
		int ab = a-b;
		int bc = b-c;

		String ans = "No";

		if ((Math.abs(ac) <= d) || ((Math.abs(ab) <= d) && (Math.abs(bc) <= d))) {
			ans = "Yes";
		}

		System.out.println(ans);

		scan.close();

	}

}
