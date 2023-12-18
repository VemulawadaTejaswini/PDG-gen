import java.util.Scanner;

public class Main {	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] p = new int[n+2];
		int[] a = new int[n+2];
		int[] b = new int[n+2];
		
		for (int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
			b[p[i]] += i;
		}
		
		for (int i=1; i<=n; i++) {
			a[i]      = n*i;
			b[n+1-i] += n*i;
		}
		
		for (int i=1; i<=n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i=1; i<=n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
