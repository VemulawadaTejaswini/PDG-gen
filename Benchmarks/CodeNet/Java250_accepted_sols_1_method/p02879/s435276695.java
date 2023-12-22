import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int answer = 0;

		if ((a >= 1 && a <= 9) && (b >= 1 && b <= 9)) {
			answer = a * b;
			System.out.println(answer);
		} else {
			System.out.println(-1);
		}
	}
}
