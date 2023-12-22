import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Integer[] a = new Integer[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int alice = 0;
		int bob = 0;
        Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 0; i < N; i++) {
			if (i%2==0) {
				alice += a[i];
			} else {
				bob += a[i];
			}
		}
		System.out.println(alice - bob);
	}
}