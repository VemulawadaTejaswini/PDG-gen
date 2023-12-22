import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t[] = new int[N];
		int x[] = new int[N];
		int y[] = new int[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int now_x = 0;
		int now_y = 0;
		int now_time = 0;
		for(int i = 0; i < N; i++) {
			if((t[i] - now_time) - (Math.abs(x[i] - now_x) + Math.abs(y[i] - now_y)) < 0) {
				System.out.println("No");
				return;
			}
			
			if((Math.abs(x[i] - now_x) + Math.abs(y[i] - now_y)) % 2 != (t[i] - now_time) % 2) {
				System.out.println("No");
				return;
			}
			now_x = x[i];
			now_y = y[i];
			now_time = t[i];
		}
		System.out.println("Yes");
	}
}
