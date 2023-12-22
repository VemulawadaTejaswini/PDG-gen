
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int next = 0;
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			if(a[i] >= max) {
				next = max;
				max = a[i];
			} else if(a[i] > next) {
				next = a[i];
			}
		}
		for(int i = 0 ; i < n ; i++) {
			if(max == a[i]) {
				System.out.println(next);
			} else {
				System.out.println(max);
			}
		}
		sc.close();
	}

}
