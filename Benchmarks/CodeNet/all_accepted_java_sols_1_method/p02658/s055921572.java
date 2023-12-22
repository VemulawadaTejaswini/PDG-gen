import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long total = 1;
		long input[] = new long[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
			if (input[i] == 0) {
				total = 0;
				break;
			}
		}
		if (total != 0) {
			for (int i = 0; i < N; i++) {
				if (input[i] > 1000000000000000000L / total) {
					total = -1;
					break;
				}
				total *= input[i];
			}
		}
		System.out.println(total);
	}
}