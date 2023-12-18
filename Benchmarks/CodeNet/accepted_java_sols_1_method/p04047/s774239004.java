import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[2 * n];
		for(int i = 0; i < 2 * n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		int ans = 0;
		for(int i = 0; i < 2 * n; i += 2) {
			ans += l[i];
		}
		System.out.println(ans);
	}
}