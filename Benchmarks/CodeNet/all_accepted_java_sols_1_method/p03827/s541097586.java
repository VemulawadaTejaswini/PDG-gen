import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int sum = 0;
		int max = 0;

		char [] strS = S.toCharArray();

		for (int i = 0; i < N; i++) {
			if (strS[i] == 'I') {
				sum += 1;
				if (sum > max) {
					max = sum;
				}
			} else if (strS[i] == 'D') {
				sum -= 1;
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
