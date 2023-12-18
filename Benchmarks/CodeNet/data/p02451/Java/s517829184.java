import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int i, j, n, q, k;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n + 1];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				k = sc.nextInt();
				System.out.println(Arrays.binarySearch(a, k) >= 0 ? "1" : "0");
			}
		}
	}
}
