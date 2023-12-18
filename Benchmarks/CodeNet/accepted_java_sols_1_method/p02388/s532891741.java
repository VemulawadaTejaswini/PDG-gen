import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
		int answer = 1;

		for (int i = 0; i < 3; i++) {
			answer *= x;
		}

		System.out.println(answer);

	}
}