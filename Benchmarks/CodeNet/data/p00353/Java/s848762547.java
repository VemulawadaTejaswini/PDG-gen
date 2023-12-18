import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int f = scan.nextInt();
		int b = scan.nextInt();
		if(b > m + f) {
			System.out.println("NA");
		} else {
			System.out.println(Math.max(b - m, 0));
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

