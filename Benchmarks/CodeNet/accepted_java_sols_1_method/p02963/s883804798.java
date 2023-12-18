import java.util.*;

public class Main {

	static final long n = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		sc.close();
		long ans[][] = new long[3][2];
		ans[0][0] = 0;
		ans[0][1] = 0;
		ans[1][1] = 0;
		ans[2][1] = n;
		ans[2][0] = 1;
		ans[1][0] = s / n;
		long r = s % n;
		ans[1][1] = r;
		if(r != 0) {
			ans[1][1] = n - r;
			ans[1][0]++;
		}
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 2; ++j)
				System.out.print(ans[i][j] + " ");
		}
		System.out.println();
	}
}
