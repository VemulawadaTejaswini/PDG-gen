import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int ans  = 0;
		boolean odd = true;
		int wall = 10;
		while(wall<=N) {
			if(odd) {
				ans += wall - wall/10;
			}
			odd = !odd;
			wall *= 10;
		}
		if(odd) ans += N - wall/10 + 1;
		System.out.println(ans);	
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

