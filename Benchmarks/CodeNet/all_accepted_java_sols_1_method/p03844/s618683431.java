import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputSplit = input.split(" ");

		int num1 = Integer.valueOf(inputSplit[0]);
		int num2 = Integer.valueOf(inputSplit[2]);
		int ans = 0;

		if (inputSplit[1].equals("+")) {
			ans = num1 + num2;
		} else {
			ans = num1 - num2;
		}

		System.out.println(ans);
	}
}