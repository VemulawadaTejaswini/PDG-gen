import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		int lb = -1, ub = Integer.MAX_VALUE/2, mid;
		while(lb + 1 < ub) {
			mid = (ub + lb) / 2;
			boolean ok = true;
			int c = 0;
			for(int i = 0; i < N; i++) {
				c += (A[i] + mid - 1) / mid - 1;
				if(c > K) {
					ok = false;
					break;
				}
			}
			if(ok)
				ub = mid;
			else
				lb = mid;
		}
		System.out.println(lb + 1);
	}

}