import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(s.equals("SSS")) {
			System.out.println(0);
			return;
		}
		int out = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == 'R' && s.charAt(i - 1) == s.charAt(i)) {
				out++;
			}
		}
		System.out.println(out);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
