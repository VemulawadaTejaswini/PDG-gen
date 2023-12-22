
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int flag = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (N == i * j) {
					flag = 1;
				}
			}
		}
		if (flag == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		scan.close();

	}
}
