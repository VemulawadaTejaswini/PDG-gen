import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextLine().length();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i++) {

			sb.append("x");

		}

		System.out.println(sb.toString());

	}
}