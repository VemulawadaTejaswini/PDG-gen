import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max  = Math.max(max, a[i]);
		}

		int half = (a[0] == max ? a[1] : a[0]);

		for(int  i = 0; i < n; i++) {
			if(a[i] == max) continue;
			if(Math.abs(a[i]*2 - max) < Math.abs(half*2 - max)) {
				half = a[i];
			}
		}
		System.out.printf("%d %d", max, half);
		sc.close();
	}

}