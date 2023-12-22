import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long judge = (long) (Math.pow(10, 18));
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		if(a[0]==0) {
			System.out.println(0);
			return;
		}
		long ans = a[0];
		for(int i = 1; i < n; i++) {
			ans*=a[i];
			if(ans>judge||ans<a[i]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans);
	}
}