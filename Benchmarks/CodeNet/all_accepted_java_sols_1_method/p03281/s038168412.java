import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int modSum = 0;
		int answer = 0;

		for (int i = 1; i <= N; i = i + 2) {
			modSum = 0;
			for (int j = 1; j < i / 2; j = j + 2) {
				if (i % j == 0) modSum++;
			}
			if (modSum + 1 == 8) answer++;
		}

		System.out.println(answer);
	}
}
