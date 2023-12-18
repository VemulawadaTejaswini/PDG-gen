import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
		int y = stdIn.nextInt();


		int answer = x % y;

		while (answer != 0) {
			x = y;
			y = answer;
			answer = x % y;
		}

		System.out.println(y);
	}
}