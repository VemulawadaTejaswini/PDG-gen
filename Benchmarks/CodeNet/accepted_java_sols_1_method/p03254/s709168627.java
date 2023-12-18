import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		Integer[] a = new Integer[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int result = 0;
		Arrays.sort(a);
		for (int i = 0; i < N && x > 0; i++) {
			x -= a[i];
          	if (x < 0) {
				break;
			}
			result++;
		}
		if (x > 0) {
			result--;
		}
		System.out.println(result);
	}
}