import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[2 * n];
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(l);
		int ans = 0;
		for (int i = 0; i < l.length; i+=2) {
			ans += l[i];
		}
		System.out.println(ans);
	}
}
