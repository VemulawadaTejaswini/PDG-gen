import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] a = new Integer[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int K = sc.nextInt();
		Arrays.sort(a, Collections.reverseOrder());
		for (int i=0; i<K; i++) {
			a[0] = a[0]*2;
		}
		int res = 0;
		for (int i=0; i<a.length; i++) {
			res += a[i];
		}
		System.out.println(res);
	}
}
