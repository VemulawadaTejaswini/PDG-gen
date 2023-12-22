import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int b = 0;
		for(int i = 0 ; i < n ; i++) {
			if(b < Math.min(a[i], a[n - 1] - a[i])) {
				b = a[i];
			}
		}
		System.out.println(a[n - 1] + " " + b);
	}
}
