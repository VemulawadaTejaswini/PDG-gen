import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] f = new Integer[N+1];
		f[0] = 0;
		for (int i = 1; i < N+1; i++) {
			f[i] = sc.nextInt();
		}
		Arrays.sort(f, Collections.reverseOrder());
		List<Integer> point = new ArrayList<>();
		for (int i = 0; i < (f.length)/2+1; i++) {
			if (i == 0) {
				point.add(f[i]);
			} else {
				point.add(f[i]);
				point.add(f[i]);
			}
		}
		long count = 0;
		for (int i = 0; i < N-1; i++) {
			count += point.get(i);
		}
		System.out.println(count);
	}
}