import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			int count = 0;
			while (num % 2 == 0 && num > 0) {
				num /= 2;
				count++;
			}
			a[i] = count;
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		in.close();
	}
}