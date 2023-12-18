import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = scan.nextInt();
		}
		Arrays.sort(l);
		int ans = 0;
		int c = 0;
		for (int i = l.length-1; ; i--) {
			c++;
			ans = ans + l[i];
			if (c == k) {
				break;
			}
		}
		System.out.println(ans);
	}
}
