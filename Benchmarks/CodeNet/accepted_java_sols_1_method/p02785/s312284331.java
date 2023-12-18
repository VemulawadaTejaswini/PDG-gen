import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), k = s.nextInt();
		long sum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-k;i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
