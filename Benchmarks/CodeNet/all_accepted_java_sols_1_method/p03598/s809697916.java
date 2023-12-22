import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;++i)
			x[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < N;++i) {
			if(x[i] > K - x[i])
				ans += 2 * (K - x[i]);
			else
				ans += 2 * x[i];
		}
		System.out.println(ans);
	}
}
