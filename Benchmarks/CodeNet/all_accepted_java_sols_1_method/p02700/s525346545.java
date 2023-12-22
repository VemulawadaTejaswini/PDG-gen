import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int X = (A + D - 1) / D;
		int Y = (C + B - 1) / B;
		if (X >= Y) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
