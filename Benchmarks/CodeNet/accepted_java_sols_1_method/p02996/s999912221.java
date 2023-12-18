import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, Comparator.comparingInt(o -> o[1]));
		
		long cnt = 0;
		for(int i = 0; i < N; i++) {
			cnt += A[i][0];
			if(cnt > A[i][1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
