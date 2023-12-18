import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		int[] D = new int[N];
		int[] count = new int[N];
		long result = 1;
		for(int i=0;i<N;i++) {
			D[i] = Integer.parseInt(sc.next());
			count[D[i]] ++;
		}
		if(D[0] != 0 || count[0] != 1) {
			out.println(0);
		}
		else {
			for (int i=1;i<N;i++) {
				for(int j=0;j<count[i];j++) {
					result *= count[i-1];
					result %= 998244353;
				}
			}
			out.println(result);
		}

		out.flush();
	}
}