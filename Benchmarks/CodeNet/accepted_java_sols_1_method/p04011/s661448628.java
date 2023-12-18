import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		
		int ans = 0;
		if(K < N)
			ans = K * X + (N-K) * Y;
		else
			ans = N * X;
		System.out.println(ans);
	}
}
