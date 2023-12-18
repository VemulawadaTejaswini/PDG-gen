import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);
		long ans = 0;
		for (int i=1; i<n; i++){
			ans += a[i];
		}
		System.out.println(ans);
	}

}