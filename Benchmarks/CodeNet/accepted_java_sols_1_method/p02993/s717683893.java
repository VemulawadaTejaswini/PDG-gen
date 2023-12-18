import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//４桁取得（abcd)
		int n = scan.nextInt();
		int a = n / 1000;
		int b = (n - a * 1000) / 100;
		int c = (n - a * 1000 - b * 100) / 10;
		int d = n - a * 1000 - b * 100 - c * 10;
		if (a == b) {
			System.out.println("Bad");
		} else if (b == c) {
			System.out.println("Bad");
		} else if (c == d) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
		scan.close();
	}

}