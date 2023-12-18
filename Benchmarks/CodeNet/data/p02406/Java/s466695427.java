import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();

		for(int i = 3; i <= n; i++) {
			if((i % 3) == 0) {
				System.out.print(" " + i);
			} else if((i % 10) == 3) {
				System.out.print(" " + i);
			}
		}

	}

}