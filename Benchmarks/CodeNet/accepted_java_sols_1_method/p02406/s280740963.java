import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		String s;
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		for (int i = 3; i <= n; i++) {
			if ((i % 3) == 0) {
				System.out.print(" " + i);
			} else if ((i % 10) == 10) {
				System.out.print(" " + i);
			} else if (String.valueOf(i).contains("3")) {
				System.out.print(" " + i);
			}
		}
		System.out.println();

	}

}