import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] a = new int[n+1];
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=1;i<=n;i++) {
				a[i] += a[i-1];
			}
			int max = Integer.MIN_VALUE;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					max = Math.max(max,a[j]-a[i-1]);
				}
			}
			System.out.println(max);
		}
	}

}