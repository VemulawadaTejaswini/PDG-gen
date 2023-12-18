import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		int[][] a = new int[k][n];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
			for (int j = 0; j < d[i]; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < d[i]; j++) {
				set.add(a[i][j]);
			}
		}
		System.out.println(n - set.size());
	}
}
