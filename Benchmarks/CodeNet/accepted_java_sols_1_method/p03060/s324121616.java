import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int c[] = new int[N];
		int v[] = new int[N];
		int p[] = new int[N];

		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < v.length; i++) {
			c[i] = sc.nextInt();
			p[i] = v[i] - c[i];
		}

		int ans=0;
		for (int i = 0; i < N; i++) {
			if (p[i] >=0) {
				ans += p[i];
			}
		}
		System.out.println(ans);

	}
}
