import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i=1;i<=N;i++) {
			a[i] = sc.nextInt();
		}

		boolean[] visited = new boolean[N+1];


		sc.close();

		int p=1;
		int ans = 0;
		while(true) {
			if(p==2) {
				break;
			}

			if(visited[a[p]]) {
				ans = -1;
				break;
			}
			p = a[p];
			visited[p] = true;
			ans++;

		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
