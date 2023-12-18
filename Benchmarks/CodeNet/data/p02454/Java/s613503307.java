import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int i, j, n, q, k, lower_bound, upper_bound;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[] a = new int[n + 1];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				k = sc.nextInt();
				lower_bound = Arrays.binarySearch(a, k);
				if(lower_bound < 0) {
					lower_bound = -lower_bound - 1;
					if(lower_bound > n) {
						lower_bound = n;
					}
					upper_bound = lower_bound;
				}else {
					upper_bound = lower_bound;
					while(lower_bound >= 1) {
						if(a[lower_bound] != a[lower_bound - 1]) {
							break;
						}
						lower_bound--;
					}
					while(upper_bound <= n - 1) {
						if(a[upper_bound] != a[upper_bound + 1]) {
							upper_bound++;
							break;
						}
						upper_bound++;
					}
				}
				System.out.println(lower_bound + " " + upper_bound);
			}
		}
	}
}
