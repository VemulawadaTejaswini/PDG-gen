import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		System.out.println(t.endsWith("s") ? t+"es" : t+"s");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}