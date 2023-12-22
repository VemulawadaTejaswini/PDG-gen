import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long answer = 0;
		if (a * c > answer) {
			answer = a * c;
		}
		if (b * d > answer) {
			answer = b * d;
		}
		if (answer == 0) {
			if (a * d > b * c) {
				answer = a * d;
			} else {
				answer = b * c;
			}
		}
		System.out.println(answer);
	}

}
