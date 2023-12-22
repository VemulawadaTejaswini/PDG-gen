import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), i=1;
		int[] r = new int[51];
		while (M-->0) {
			r[sc.nextInt()]++; r[sc.nextInt()]++;
		}
		while (i<=N) System.out.println(r[i++]);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}