import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < N;++i) {
			ans++;
			for(int j = A[i]+1;j <= D;j += A[i]) {
				ans++;
			}
		}
		ans += X;
		System.out.println(ans);
	}
}
