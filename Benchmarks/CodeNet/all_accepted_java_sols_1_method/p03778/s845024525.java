import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b > a) {
			if(b - (a + W) <= 0) {
				System.out.println(0);
			} else {
				System.out.println(b - (a + W));
			}
		} else {
			if(a - (b + W) <= 0) {
				System.out.println(0);
			} else {
				System.out.println(a - (b + W));
			}
		}
		scan.close();

	}

}
