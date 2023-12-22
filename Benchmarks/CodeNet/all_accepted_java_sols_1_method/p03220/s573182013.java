import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int A = in.nextInt();
		List<Integer> H = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			H.add(in.nextInt());
		}
		in.close();

		List<Double> temps = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			double temp = (double) T - (double) (H.get(i)) * 0.006;
			temps.add(temp);
		}
		double diff = Double.MAX_VALUE;
		int result = -1;
		for (int i = 0; i < H.size(); ++i) {
			if (Math.abs(temps.get(i) - (double) A) < diff) {
				diff = Math.abs(temps.get(i) - (double) A);
				result = i;
			}
		}
		System.out.println((result + 1));
	}

}