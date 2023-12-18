import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long ans ;
		if(N == M) {
			ans = 2;
			for(int i = 1; i <= N; i++)
				ans = ans * i % 1000000007;
			for(int i = 1; i <= N; i++)
				ans = ans * i % 1000000007;
		}
		else if(Math.abs(N-M) == 1) {
			ans = 1;
			for(int i = 1; i <= N; i++)
				ans = ans * i % 1000000007;
			for(int i = 1; i <= M; i++)
				ans = ans * i % 1000000007;
		}
		else
			ans = 0;
		System.out.println(ans);
	}

}