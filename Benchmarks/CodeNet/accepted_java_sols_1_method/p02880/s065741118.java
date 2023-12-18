import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean valid = false;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i*j==N) valid = true;
			}
		}
		System.out.println(valid?"Yes":"No");
	}
}