import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n + 1];
		long ans = 0;
		b[0] = 1000000;
		b[n] = b[0];
		for (int i = 1; i < n; ++i)
			b[i] = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; ++i)
		ans += Math.min(b[i - 1], b[i]);
		System.out.println(ans);
	}
}