import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int W = scan.nextInt();

		if (W >= S) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}
}