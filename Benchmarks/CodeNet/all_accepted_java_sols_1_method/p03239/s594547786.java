
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int ans = 1001;
		for(int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(t <= T) {
				ans = Math.min(ans, c);
			}
		}
		if(ans <= 1000) {
			System.out.println(ans);
		} else {
			System.out.println("TLE");
		}
	}

}
