import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		long K = stdIn.nextLong();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt());
		}
		for(int i = 0; i < M; i ++) {
			B.add(stdIn.nextInt());
		}
		
		long time = 0;
		int ans = 0;
		
		int idxA = -1;
		int idxB = -1;
		while(true) {
			idxB ++;
			if(M <= idxB) {
				idxB --;
				break;
			}
			time += B.get(idxB);
			ans ++;
			if(K < time) {
				time -= B.get(idxB);
				ans --;
				idxB --;
				break;
			}
		}
		
		int max = ans;
		
		while(idxA < N) {
			idxA ++;
			if(N <= idxA) {
				idxA --;
				break;
			}
			time += A.get(idxA);
			ans ++;
			while(0 <= idxB && K < time) {
				time -= B.get(idxB);
				idxB --;
				ans --;
			}
			if(K < time) {
				time -= A.get(idxA);
				idxA --;
				ans --;
				break;
			}
			max = Math.max(max, ans);
		}
		
		System.out.println(max);
	}
}