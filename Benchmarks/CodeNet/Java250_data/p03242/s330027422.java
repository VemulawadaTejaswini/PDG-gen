import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		for(int i = 0; i < 3; i++) {
			if(n.charAt(i) == '1') System.out.print(9);
			else if(n.charAt(i) == '9') System.out.print(1);
			else System.out.print(n.charAt(i));
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
