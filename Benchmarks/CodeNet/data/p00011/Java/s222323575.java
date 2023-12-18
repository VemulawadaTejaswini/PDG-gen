import java.util.*;
import static java.util.Arrays.*;
public class Main {
	static boolean debug = false;
	static void p(Object... os) { if(debug) System.err.println(deepToString(os)); }
	public static void main(String[] args) {
		new Main().start();
	}
	private Scanner sc = new Scanner(System.in);
	//public Main() { sc.useDelimiter("\n|\\,|\\s+"); }
	void start() {
		int N,W=0;
		N = sc.nextInt();
		W = sc.nextInt();
		p("N=",N);
		p("W=",W);
		int[] ab = new int[N];
		for(int i = 0; i < N; i++) ab[i] = i+1;
		for(int i = 0; i < W; i++) {
			int a, b, tmp = 0;
			String[] rec = sc.next().split(",");
			a = Integer.parseInt(rec[0])-1;
			b = Integer.parseInt(rec[1])-1;
			System.out.printf("a=%d, b=%d\n",a,b);
			tmp = ab[a];
			ab[a] = ab[b];
			ab[b] = tmp;
		}
		for(int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}
	}
}