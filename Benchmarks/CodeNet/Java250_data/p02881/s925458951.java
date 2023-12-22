import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();

		sc.close();

		long ans = Long.MAX_VALUE;

		for(long i = 1;i<=Math.sqrt(N);i++) {
			if(N%i == 0) {
				ans = Math.min(ans, (i-1)+(N/i-1));
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
