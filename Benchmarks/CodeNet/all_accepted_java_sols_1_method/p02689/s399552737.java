import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean ans[] = new boolean[N];
		Arrays.fill(ans, true);
		int H[] = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int A[][] = new int[M][2];
		for(int i = 0; i < M; i++) {
			A[i][0] = sc.nextInt() - 1;
			A[i][1] = sc.nextInt() - 1;
			if(H[A[i][0]] < H[A[i][1]]) {
				ans[A[i][0]] = false;
			} else if(H[A[i][1]] < H[A[i][0]]){
				ans[A[i][1]] = false;
			} else {
				ans[A[i][0]] = false;
				ans[A[i][1]] = false;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(ans[i]) cnt++;
		}
		System.out.println(cnt);
	}
}
