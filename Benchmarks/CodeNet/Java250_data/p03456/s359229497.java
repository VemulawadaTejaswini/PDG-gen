import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double k = Double.parseDouble(sc.next()+sc.next());
		int t = (int)Math.sqrt(k);
		System.out.println(t*t==k ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}