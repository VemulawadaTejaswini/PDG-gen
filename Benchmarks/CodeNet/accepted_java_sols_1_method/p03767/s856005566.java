import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		Integer[] a = new Integer[n*3];
		for (int i = 0;i < 3*n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		long ret = 0;
		for (int i = 0;i < n;i++) {
			ret += a[i*2+1];
		}
		System.out.println(ret);
	}
}