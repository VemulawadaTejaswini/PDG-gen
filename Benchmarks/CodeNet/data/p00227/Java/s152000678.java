import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			Integer[] ps = new Integer[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				ps[i] = sc.nextInt();
				sum += ps[i];
			}
			Arrays.sort(ps, new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					return b - a;
				}
			});
			for (int i = 0; i < ps.length / m; i++) {
				sum -= ps[i*m+m-1];
			}
			System.out.println(sum);
		}
	}
}