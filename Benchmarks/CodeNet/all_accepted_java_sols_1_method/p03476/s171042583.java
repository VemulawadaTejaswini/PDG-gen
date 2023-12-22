import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		boolean[] np = new boolean[100001];
		np[0] = true;
		np[1] = true;
		int[] pc = new int[100001];
		int c = 0;
		for(int i = 2; i <= 100000; i++) {
			if(!np[i]) {;
				if(!np[(i + 1) / 2])
					c++;
				for(int j = 2; i * j <= 100000; j++) {
					np[i * j] = true;
				}
			}
			pc[i] = c;
		}
		int q = Integer.parseInt(sc.next());
		for(int i = 0; i < q; i++) {
			out.println(-pc[Integer.parseInt(sc.next()) - 1] + pc[Integer.parseInt(sc.next())]);
		}
		out.flush();
	}
}