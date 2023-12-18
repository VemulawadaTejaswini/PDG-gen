import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Integer[] l = new Integer[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(l, Comparator.reverseOrder());
		int sum = 0;
		for (int i = 1; i < l.length; i++) {
			sum += l[i];
		}
		if (l[0] < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}