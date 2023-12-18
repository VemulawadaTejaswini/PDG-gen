import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = i + 1;
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, Comparator.comparingInt(x -> x[1]));
		for (int i = 0; i < n; i++) {
			System.out.print(a[i][0]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
