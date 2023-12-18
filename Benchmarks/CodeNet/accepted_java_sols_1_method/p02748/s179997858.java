import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long M = sc.nextLong();
		long minA = 1000000;
		long minB = 1000000;

		long[] aa = new long[(int)A];
		long[] bb = new long[(int)B];
		

		for (int i = 0; i < (int)A; i++) {
			aa[i] = sc.nextLong(); 
			if (aa[i] < minA) {
				minA = aa[i];
			}
		}
		for (int i = 0; i < (int)B; i++) {
			bb[i] = sc.nextLong();
			if (bb[i] < minB) {
				minB = bb[i];
			}
		}	
		long ans = minA + minB;
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			long c = sc.nextLong();
			if (aa[x] + bb[y] - c < ans) {
				ans = aa[x] + bb[y] - c;
			}
		}
		System.out.println(ans);
	}

}