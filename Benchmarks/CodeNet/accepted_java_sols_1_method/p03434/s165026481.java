import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int score = a[N-1];
			for(int j = 0; j < N-1; j++) {
				score -= a[N-2-j] * Math.pow(-1, j);
			}
		System.out.println(score);
	}

}
