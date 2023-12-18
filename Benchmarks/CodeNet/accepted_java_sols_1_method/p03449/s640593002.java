import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++)
				A[i][j] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int num = 0;
			for(int j = 0; j <= i; j++)
				num += A[0][j];
			for(int j = i; j < N; j++)
				num += A[1][j];
			ans = Math.max(ans, num);
		}
		System.out.println(ans);

	}

}