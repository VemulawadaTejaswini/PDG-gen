import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt(), b[] = new int[m], ans = 0;
		for (int j = 0; j < m; j++)
			b[j] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int val = 0;
			for (int j = 0; j < m; j++)
				val += sc.nextInt() * b[j];
			if (val + c > 0)
				++ans;
		}
		System.out.println(ans);
		sc.close();
	}
}
