
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long max = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			max = Math.max(max, a[i]);
		}
		long half = 0;
		for(int i = 0; i < n; i++) {
			if(Math.abs(max / 2 - half) > Math.abs(max / 2 - a[i])) {
				half = a[i];
			}
		}
		System.out.println(max + " " + half);
	}

}
