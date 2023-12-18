import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		long ans = 0;

		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}

		for(int i=0;i<n-1;i++) {
			if(a[i] > a[i+1]) {
				ans += a[i] - a[i+1];
				a[i+1] = a[i];
			}
		}

		System.out.println(ans);

	}

}