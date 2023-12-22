import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int n = scan.nextInt();
		for (int i = 3; i <= n; i++) {
			if ((i % 3) == 0) {
				output.append(" ").append(i);
			} else  {
				int x = i;
				while (x != 0) {
					if ((x % 10) == 3) {
						output.append(" ").append(i);
						break;
					}
					x /= 10;
				}
			}
		}
		System.out.println(output);
	}
}