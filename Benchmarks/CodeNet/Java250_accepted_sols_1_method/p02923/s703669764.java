import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prev = 0;
		int count = 0;
		int ans = 0;
		
		for (int i=0; i<N; i++) {
			int tmp = sc.nextInt();
			if (prev >= tmp) {
				count++;
				ans = Math.max(ans, count);
			} else {
				count = 0;
			}
			prev = tmp;
		}
		System.out.println(ans);
	}
}
