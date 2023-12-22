import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] R = new Integer[n];
		for(int i=0;i<n;i++) {
			R[i] = in.nextInt();
		}

		long maxv = -10000000000L;//R[j] - R[i]の最大値
		long minv = R[0];//以前のR[j]の最小値

		for(int j=1;j<n;j++) {
			maxv = Math.max(maxv,R[j]-minv);
			minv = Math.min(minv, R[j]);
		}
		System.out.println(maxv);
	}
}

