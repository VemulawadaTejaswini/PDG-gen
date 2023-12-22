import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long x = sc.nextLong();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		long ans = 0;
		for (int i = 0; i < N-1; i++) {
			long tmp = map[i] + map[i+1];
			if (tmp > x) {
				long eat = tmp - x;
				if (map[i+1] - eat < 0) {
					map[i] -= eat - map[i+1];
					map[i+1] = 0;
				} else {
					map[i+1] -= eat;
				}
				ans += eat;
			}
		}
		
		System.out.println(ans);
	}
}