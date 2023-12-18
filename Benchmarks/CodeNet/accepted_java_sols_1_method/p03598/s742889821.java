import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, x[], ans = 0;
		n = sc.nextInt();
		k = sc.nextInt();
		x = new int[n];
		for(int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			int tmp = Math.abs(k - x[i]);
			ans += 2 * Math.min(x[i],  tmp);
		}
		sc.close();
		System.out.println(ans);
	}

}
