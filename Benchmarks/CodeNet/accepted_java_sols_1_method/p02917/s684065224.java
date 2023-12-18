import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a[] = new int[n];
		int b[] = new int[n-1];
		int ans = 0;
		
		for (int i = 0 ; i < n -1 ; i++ ) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		a[n-1] = b[n-2];
		a[0] = b[0];
		for (int i = n - 2 ; 0 < i ; i-- ) {
			a[i] = Math.min(b[i],b[i-1]);
		}
		

		
		for (int i : a) {
			ans += i;
		}
		
		
		
		
		System.out.println(ans);
		
			}
	
}