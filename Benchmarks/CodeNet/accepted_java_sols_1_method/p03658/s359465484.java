import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long sum = 0;
		Integer [] l = new Integer[N];

		for(int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l,Collections.reverseOrder());

		for(int i = 0; i < K; i++) {
			sum += l[i];
		}
		System.out.println(sum);
	}
}
