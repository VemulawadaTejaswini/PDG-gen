import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}
		sc.close();

		int min = 1000;
		for (int i = 0; i < m.length; i++) {
			x -= m[i];
			min = Math.min(min, m[i]);
		}
		int ans = n + x / min;
		System.out.println(ans);
	}
}
