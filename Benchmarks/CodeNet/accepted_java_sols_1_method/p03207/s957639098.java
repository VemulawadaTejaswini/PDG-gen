import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		a[n-1] = a[n-1]/2;
		int sum=0;
		for (int i = 0; i <= n - 1; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}