import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int absMin = 1000;
		for (int i = 0; i < n; i++) {
			if (Math.abs(l + i) < Math.abs(absMin)) {
				absMin = l + i;
			}
			a[i] = l + i;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		sum -= absMin;
		System.out.println(sum);

	}

}
