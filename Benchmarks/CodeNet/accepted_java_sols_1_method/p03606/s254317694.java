import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] guest = new int[N][2];
		for(int i = 0;i < N;++i) {
			guest[i][0] = sc.nextInt();
			guest[i][1] = sc.nextInt();
		}
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < N;++i) {
			ans += guest[i][1] - guest[i][0] + 1;
		}
		System.out.println(ans);
	}
}
