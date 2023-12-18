import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int[] DP = new int[10010];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();

		Arrays.fill(DP, 0);
		for(int i = 0;i < H;i++){
			for(int j = 0;j < N;j++){
				int cnt = 0;
				cnt = (i - A[j] < 0) ? B[j] : B[j]+DP[i-A[j]];
				if(cnt < DP[i] || DP[i]==0){
					DP[i] = cnt;
				}
			}
		}
		System.out.println(DP[H-1]);
	}
}