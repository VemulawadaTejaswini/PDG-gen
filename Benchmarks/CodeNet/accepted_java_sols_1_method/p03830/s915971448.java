import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cd = new int[N+1];
		long ans = 1;
		for(int i = 1; i <= N; i++) {
			int a = i;
			for(int j = 2; j <= i; j++) {
				while(a % j == 0 && a > 0) {
					cd[j]++;
					a /= j;
				}
			}
		}
		for(int i = 0; i <= N; i++)
			ans = ans * (cd[i] + 1) % 1000000007;
		System.out.println(ans);
	}

}