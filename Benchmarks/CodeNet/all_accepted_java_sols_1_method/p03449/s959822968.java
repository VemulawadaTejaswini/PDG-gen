import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] uarr = new int[n];
		int[] darr = new int[n];
		for (int i = 0; i < n; i++) {
			uarr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			darr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					count += uarr[j];
				}
				if (j >= i) {
					count += darr[j];
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
