import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0) {
				break;
			}
			int[] a = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = n - i;
			}
			for(int i=0; i<r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				int[] b = new int[p];

				for(int j=0; j<p-1; j++) {
					b[j] = a[j];
				}
				for(int j=0; j<c; j++) {
					a[j] = a[p+j-1];
				}
				for(int j=0; j<p-1; j++) {
					a[j+c] = b[j];
				}
			}
			System.out.println(a[0]);
		}
		sc.close();
	}
}