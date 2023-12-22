import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int num = N*3;
		Long a[] = new Long[num];
		for (int i = 0; i < num; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long result = 0;
		Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 1; N > 0; i+=2) {
			result += a[i];
			N--;
		}
		System.out.println(result);
	}
}