import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		boolean[] color = new boolean[8];
		int n = sc.nextInt(), mi=0, ma=0;
		while (n-->0) {
			int a = sc.nextInt();
			if (a/400>7) ma++;
			else color[a/400]=true;
		}
		for (boolean t : color) if (t) mi++;
		// Missed the case where there could be ratings above 3200 only
		System.out.println(Math.max(mi,1)+" "+(mi+ma));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}