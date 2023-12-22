import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 1; i <= 5; i++) {
			if (num[i - 1] == 0) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}