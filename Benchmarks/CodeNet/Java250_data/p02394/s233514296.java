import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Problem().solve();
	}
}

class Problem {
	void solve() {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		int right = x + r;
		int left = x - r;
		int top = y + r;
		int bottom = y - r;
		
		if (right <= w 
				&& left >= 0 
				&& top <= h 
				&& bottom >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}