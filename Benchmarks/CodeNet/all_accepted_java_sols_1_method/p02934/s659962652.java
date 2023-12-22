import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		double[] A = new double[N];
		double[] gyakusu = new double[N];
		double sum = 0;
		for (int i=0;i<N;i++) {
			A[i] = Double.parseDouble(sc.next());
			gyakusu[i] = 1/A[i];
			sum+=gyakusu[i];
		}
		System.out.println(1/sum);
	}
}