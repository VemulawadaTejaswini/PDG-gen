import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		float sum = 0;
		for (int y=0; y<n; y++) {
			a[y] = sc.nextInt();
			sum += a[y];
		}
		int p = Math.round(sum/n);
		int res = 0;
		for (int i=0; i<n; i++) {
			res += (a[i] - p)*(a[i] - p);
		}
		System.out.println(res);
		sc.close();
	}

}
