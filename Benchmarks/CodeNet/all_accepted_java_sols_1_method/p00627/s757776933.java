import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int n; (n = in.nextInt() / 4) > 0;) {
			int sum = 0;
			while (n-- > 0) {
				sum += in.nextInt();
			}
			System.out.println(sum);
		}
	}
}