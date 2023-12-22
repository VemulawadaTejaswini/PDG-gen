import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = Integer.MIN_VALUE;
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				ans = Math.max(ans, Math.abs(a[i]-a[j]));
			}
		}
		out.println(ans);
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
