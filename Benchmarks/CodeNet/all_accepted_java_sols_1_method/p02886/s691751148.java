import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] d = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = i + 1; j < d.length; j++) {
				ans += d[i] * d[j];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}