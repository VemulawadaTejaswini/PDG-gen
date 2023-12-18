import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if ((i % 3) == 0 || (i % 10) == 3) {
				output.append(i).append(" ");
			}
		}
		System.out.println(output);
	}
}