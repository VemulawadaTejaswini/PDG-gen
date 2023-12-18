import java.util.Scanner;


public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int ans = 0;
			int min = 1000, max = 0;
			for(int i = 0; i < n; ++i) {
				int s = sc.nextInt();
				ans += s;
				min = Math.min(min, s);
				max = Math.max(max, s);
			}
			ans -= min;
			ans -= max;
			ans /= n - 2;
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}