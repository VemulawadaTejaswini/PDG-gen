import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		long[][] cake = new long[N][3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++){
				cake[i][j] = sc.nextLong();
			}
		}
		long ans = 0;
		for(int i = 0; i < 8; i++) {
			long[] sort = new long[N];
			for(int j = 0; j < N; j++) {
				sort[j] += (((i >> 0) & 1) == 1) ? -cake[j][0] : cake[j][0];
				sort[j] += (((i >> 1) & 1) == 1) ? -cake[j][1] : cake[j][1];
				sort[j] += (((i >> 2) & 1) == 1) ? -cake[j][2] : cake[j][2];
			}
			Arrays.sort(sort);
			long tmp = 0;
			for(int j = N - 1; j >= N - M; j--) tmp += sort[j];
			ans = Math.max(tmp, ans);
		}
		System.out.println(ans);
	}
}