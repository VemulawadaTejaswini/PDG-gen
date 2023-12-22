import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count = 0;
		while (count < len) {
			int j = sc.nextInt();
			if (j % 2 == 0) {
				if (j % 3 != 0 && j % 5 != 0) {
					break;
				}
			}
			count ++;

		}
		if (count == len) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}

	}
}
