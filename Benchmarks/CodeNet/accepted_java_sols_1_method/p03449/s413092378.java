import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A1 = new int[N + 1];
		int[] A2 = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A1[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			A2[i] = sc.nextInt();
		}
		int[] s1 = new int[N + 1];
		int[] s2 = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			int j = N - i + 1;
			if (i == 1) {
				s1[i] = A1[i];
				s2[j] = A2[j];
			} else {
				s1[i] = A1[i] + s1[i - 1];
				s2[j] = A2[j] + s2[j + 1];
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			if (i == 1 || max < s1[i] + s2[i]) {
				max = s1[i] + s2[i];
			}
		}
		System.out.println(max);
	}

}
