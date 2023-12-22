import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int end = l + n - 1;
		int sum;
		if (l >= 0) {
			sum = (l + 1 + end) * (n - 1) / 2;
		} else if (end > 0) {
			sum = (l + end) * n / 2;
		} else {
			sum = (l + end - 1) * (n - 1) / 2;
		}
		System.out.println(sum);
	}
}
