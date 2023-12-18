import java.util.Scanner;

public class Main {
	final int MAX_N = 2000000;
	final int K = 10000;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[MAX_N + 1];
		for (int j = 1; j <= n; j++)
			a[j] = scan.nextInt();
		
		int[] c = new int[K + 1];
		for (int i = 1; i <= n; i++)
			c[a[i]] += 1;
		
		for (int i = 1; i <= K; i++)
			c[i] += c[i - 1];
		
		int[] b = new int[n + 1];
		for (int j = n; j >= 1; j--) {
			b[c[a[j]]] = a[j];
			c[a[j]]--;
		}
		
		for (int i = 0; i < n; i++)
			System.out.print(b[i] + (i == n - 1 ? "\n" : " "));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

