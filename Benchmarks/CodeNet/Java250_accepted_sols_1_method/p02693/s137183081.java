import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int multi_num = sc.nextInt();
		int low_lim = sc.nextInt();
		int high_lim = sc.nextInt();

		for (int i = low_lim; i <= high_lim; i++) {
			if (i % multi_num ==0) {
				System.out.println("OK");
				break;
			}
			if (i == high_lim) {
				System.out.println("NG");
			}
		}
	}
}