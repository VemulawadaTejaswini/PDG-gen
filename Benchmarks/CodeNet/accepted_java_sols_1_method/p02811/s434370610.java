

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		if (500 * K >= X) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}
