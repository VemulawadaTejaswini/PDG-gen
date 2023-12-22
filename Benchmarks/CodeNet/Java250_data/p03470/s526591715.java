import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] d = new int[101];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			d[a]++;
		}
		
		for (int i = 0; i <= 100; i++) {
			if (d[i] != 0) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);

		sc.close();
	}
}
