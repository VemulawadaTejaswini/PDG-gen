import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numberBox = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			numberBox[i] = sc.nextInt();
			sum = sum + numberBox[i];
		}
		sc.close();
		int c = 0;
		for (int j = 0; j < N; j++) {
			if (c < numberBox[j]) {
				c = numberBox[j];
			}
		}
		String answer = "No";
		if (sum > (2 * c)) {
			answer = "Yes";
		}
		System.out.println(answer);
	}
}
