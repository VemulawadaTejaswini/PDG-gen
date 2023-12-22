import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			String res = "Yes";
			if(s.equals("BBB")||s.equals("AAA")) {
				res = "No";
			}
			System.out.println(res);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
