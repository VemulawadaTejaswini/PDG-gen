import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 0;

		try(Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
			int ans = num * num * num;

			System.out.println(ans);
		}
	}
}