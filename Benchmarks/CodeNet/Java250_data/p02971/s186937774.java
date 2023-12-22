import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		int max = 0;
		int second_max = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		for(int i = 0; i < n; i++) {
			if(b[n-1]==a[i]) {
				System.out.println(b[n-2]);
			}
			else {
				System.out.println(b[n-1]);
			}
		}
	}
}
