
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = k;
		int cnt = 1;
		for (int i = 0; ; i++) {
			if (sum >= n) {
				break;
			}
			sum += (k - 1);
			cnt++;
		}
		System.out.println(cnt);
	}
}
