import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] height = new long[N];
		for(int i = 0; i < N ; i++) {
			height[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0; i < N-1; i++) {
			if(height[i] > height[i+1]) {
				long tmp = height[i]-height[i+1];
				ans += tmp;
				height[i+1]  += tmp;
			}
		}
		System.out.println(ans);

	}
}