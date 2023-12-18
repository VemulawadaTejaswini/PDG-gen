import java.util.*;
class Main {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0) {
			double[] A = new double[]{in.nextDouble(), in.nextDouble()};
			double[] B = new double[]{in.nextDouble(), in.nextDouble()};
			double[] C = new double[]{in.nextDouble(), in.nextDouble()};
			double[] D = new double[]{in.nextDouble(), in.nextDouble()};
			double dist1 = (C[0] - A[0]) / (C[1] - A[1]);
			double dist2 = (D[0] - B[0]) / (D[1] - B[1]);
			System.out.println(dist1==dist2?"YES":"NO");
		}
	}
}