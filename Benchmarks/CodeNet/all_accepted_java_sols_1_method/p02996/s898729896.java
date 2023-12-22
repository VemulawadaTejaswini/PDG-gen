import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ab = new int[n][2];
		for (int i = 0; i < ab.length; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		Arrays.sort(ab, Comparator.comparingInt(a -> a[1]));
		int current = 0;
		for (int i = 0; i < ab.length; i++) {
			current += ab[i][0];
			if (current > ab[i][1]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
