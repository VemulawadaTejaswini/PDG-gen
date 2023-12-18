import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		W = Math.abs(W);
		H = Math.abs(H);
		int a = Math.abs(x + r);
		int b = Math.abs(y + r);

		if (x <= 0 | y <= 0) {
			System.out.println("No");
		} else if(W >= a & H >= b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}