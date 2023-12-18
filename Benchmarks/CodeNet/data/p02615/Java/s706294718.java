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
		long count = 0;
		for (int i = 0; i < f.length-2; i++) {
			count += f[i];
		}
		System.out.println(count);
	}
}