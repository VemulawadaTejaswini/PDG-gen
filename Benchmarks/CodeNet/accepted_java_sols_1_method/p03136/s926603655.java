
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(L);
		int sum = 0;
		for (int i = 0; i < N - 1; i++) {
			sum += L[i];
		}
		if (sum > L[N - 1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
