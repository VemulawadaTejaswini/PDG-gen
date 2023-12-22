import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int[] y = x.clone();
		Arrays.sort(y);

		int mid1 = y[y.length/2-1];
		int mid2 = y[y.length/2];
		for(int i = 0; i < n; i++) {
			if(x[i] <= mid1)
				System.out.println(mid2);
			else
				System.out.println(mid1);
		}
	}
}
