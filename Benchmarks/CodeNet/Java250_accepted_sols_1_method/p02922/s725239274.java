import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = A;
		int answer = 1;

		while (sum < B) {
			sum += A - 1;
			answer++;
		}

		if (B == 1) {
			System.out.println(0);
		} else {
			System.out.println(answer);
		}
	}
}
