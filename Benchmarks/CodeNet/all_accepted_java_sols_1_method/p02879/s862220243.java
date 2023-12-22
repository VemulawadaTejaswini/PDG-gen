import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int answer = 0;

		if ((A >= 1 && A <= 9) && (B >= 1 && B <= 9)) {
			answer = (A * B);
		} else {
			answer = -1;
		}

		System.out.println(answer);

		sc.close();
	}
}