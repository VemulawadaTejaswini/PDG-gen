import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Integer> a = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			a.add(in.nextInt());
		}
		in.close();

		double ave = 0.0;
		for (Integer val : a) {
			ave += (double) val;
		}
		ave /= (double) (a.size());
		int index = -1;
		double diff = Double.MAX_VALUE;
		for (int i = 0; i < N; ++i) {
			if (diff > Math.abs((double) a.get(i) - ave)) {
				index = i;
				diff = Math.abs((double) a.get(i) - ave);
			}
		}
		System.out.println(index);
	}

}