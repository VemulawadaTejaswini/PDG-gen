import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int p[];
		
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
			}
			Arrays.sort(p);
			int sum = 0;
			for (int i = n - 1; 0 <= i; i--) {
				if ((n - i) % m != 0) {
					sum += p[i];
				}
			}
			System.out.println(sum);
		}
	}
}