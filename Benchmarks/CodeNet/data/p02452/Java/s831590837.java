import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int i, j, n, q, k, counter = 1;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n + 1];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				k = sc.nextInt();
				if(Arrays.binarySearch(a, k) < 0) {
					counter = 0;
					break;
				}
			}
			System.out.println(counter);
		}
	}
}
