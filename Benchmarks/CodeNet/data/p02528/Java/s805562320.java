import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int num[] = new int[number];
		int tmp;

		for (int i = 0; i < number; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number - 1; j++) {
				if (num[j] > num[j + 1]) {
					tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < number; i++) {
			System.out.printf("%d ", num[i]);
		}
		System.out.printf("\n");
	}
}