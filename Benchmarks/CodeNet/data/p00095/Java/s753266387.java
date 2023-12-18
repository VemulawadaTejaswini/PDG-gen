
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] num = new int[n + 1];
		int max = 0;
		int d = 0;
		for (int i = 1; i <= n; i++) {
			int c = Integer.parseInt(scanner.nextLine().split(" ")[1]);
			if (max < c) {
				max = c;
				d = i;
				num[i] = c;
			}
		}
		System.out.println(d + " " + num[d]);
	}
}