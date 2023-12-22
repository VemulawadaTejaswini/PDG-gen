import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int A = in.nextInt();
		int[] H  = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = in.nextInt();
		}
		double[] aveT = new double[N];
		for (int i = 0; i < N; i++) {
			aveT[i] = T - H[i] * 0.006;
		}
		int min = 0;
		for (int i = 1; i < N; i++) {
			if (Math.abs(aveT[i]-A) < Math.abs(aveT[min]-A)) {
				min = i;
			}
		}
		System.out.println(min+1);
	}

}
