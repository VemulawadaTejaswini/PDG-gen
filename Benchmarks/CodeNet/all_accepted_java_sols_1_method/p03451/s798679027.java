import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[][] nums = new int[2][N];
		long answer = 0;
		
		for (int a = 0; a < 2; a++) {
			for (int i = 0; i < N; i++) {
				nums[a][i] = in.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			long temp = 0;
			for (int j = 0; j <= i; j++) {
				temp += nums[0][j];
			}
			for (int j = i; j < N; j++) {
				temp += nums[1][j];
			}
			answer = Math.max(answer, temp);
		}
		
		System.out.println(answer);
	}
}
