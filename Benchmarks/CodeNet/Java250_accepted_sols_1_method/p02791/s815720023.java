
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			int t = sc.nextInt();
			a[i] = t;
			if (t <= min) {
				min = t;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
