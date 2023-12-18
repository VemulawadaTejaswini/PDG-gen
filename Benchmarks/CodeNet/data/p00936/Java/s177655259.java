import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] R = new int[N];
		for(int i = 0; i < N; i++){
			R[i] = sc.nextInt();
		}
		double[] pos = new double[N];
		double max = 0;
		for(int i = 0; i < N; i++){
			double pp = R[i];
			for(int j = 0; j < i; j++){
				double c = R[j] + R[i];
				double a = Math.abs(R[j] - R[i]);
				double b = Math.sqrt(c * c - a * a);
				pp = Math.max(pp, b + pos[j]);
			}
			pos[i] = pp;
			max = Math.max(pos[i] + R[i], max);
		}
		System.out.println(max);
	
	}

}