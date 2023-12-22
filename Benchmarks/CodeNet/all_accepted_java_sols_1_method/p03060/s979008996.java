import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),ans=0;
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(a[i]-b[i] > 0) ans += a[i]-b[i];
		}
		System.out.println(ans);
	}
}
