import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int minPercent10 = b * 10;
		int maxPercent10 = b * 10 + 9;

		int answer = -1;
		for (int i = minPercent10; i <= maxPercent10; i++) {
			if ((int)(0.08 * i) == a) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);

	}
}