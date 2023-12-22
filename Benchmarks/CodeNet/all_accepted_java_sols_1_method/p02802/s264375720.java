import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] isAc = new boolean[N+1];
		Arrays.fill(isAc, false);
		int[] was = new int[N+1];
		Arrays.fill(was, 0);
		int ac = 0;
		int wa = 0;

		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if (isAc[p]) continue;
			if (s.equals("WA")) was[p]++;
			else {
				ac++;
				isAc[p] = true;
				wa += was[p];
			}
		}
		System.out.println(ac+" "+wa);
	}
}