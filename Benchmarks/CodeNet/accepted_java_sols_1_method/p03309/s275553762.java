import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i=0; i<n; i++){
			a[i] = scanner.nextInt()-(i+1);
		}
		Arrays.sort(a);
		int center;
		if (n%2==0){
			center = (a[n/2-1]+a[n/2])/2;
		}else {
			center = a[(n+1)/2-1];
		}
		long ans = Long.MAX_VALUE;
		for (int d=-2; d<=2; d++){
			long anscand = 0;
			for (int i=0; i<n; i++) {
				anscand += Math.abs(a[i]-(center+d));
			}
			ans = Math.min(ans, anscand);
		}
		System.out.println(ans);
	}
}