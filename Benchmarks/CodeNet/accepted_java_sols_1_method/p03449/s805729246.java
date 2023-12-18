import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A1 = new int[N+1], A2 = new int[N+1];
		for(int i = 1;i < N+1;i++) {
			A1[i] = A1[i-1] + scn.nextInt();
		}
		for(int i = 1;i < N+1;i++) {
			A2[i] = A2[i-1] + scn.nextInt();
		}
		int ans = 0;
		for(int i = 0;i < N;i++) {
			ans = Math.max(ans, A1[i+1] - A1[0] + A2[N] - A2[i]);
		}
		System.out.println(ans);
	}

}
