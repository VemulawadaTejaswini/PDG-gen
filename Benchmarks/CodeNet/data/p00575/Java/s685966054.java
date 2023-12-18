import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int coin = 0;
		int day = 0;
		while (coin < C) {
			day++;
			coin += A;
			if (day % 7 == 0) {
				coin += B;
			}
			if (coin >= C) {
				break;
			}
		}
		System.out.println(day);
	}

}

