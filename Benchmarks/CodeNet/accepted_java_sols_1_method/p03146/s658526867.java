import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int s = sc.nextInt();
		int[] a = new int[1000000];
		a[0] = s;
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(a[0], 0);
		for (int i = 1; i < 1000000; i++) {
			if (a[i - 1] % 2 == 0) {
				a[i] = a[i - 1] / 2;
			} else {
				a[i] = 3 * a[i - 1] + 1;
			}
			if (hm.containsKey(a[i])) {
				System.out.println(i + 1);
				break;
			} else {
				hm.put(a[i], i);
			}
		}
	}
}
