import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt(), H = scanner.nextInt(), x = scanner.nextInt(), y = scanner.nextInt(), r = scanner.nextInt();
		String answer;

		if (x + r <= W && x - r >= 0 && y + r <= H && y - r >= 0)
			answer = "Yes";
		else
			answer = "No";

		System.out.println(answer);
	}
}