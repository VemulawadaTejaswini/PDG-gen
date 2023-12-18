import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		String answer;

		if (a < b && b < c)
			answer = "Yes";
		else
			answer = "No";

		System.out.println(answer);
	}
}