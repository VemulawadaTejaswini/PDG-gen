import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int h[] = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = scan.nextInt();
		}
		long ans = 0;
		
		Arrays.sort(h);
		for(int i=n-k-1;i>=0;i--) {
			ans += h[i];
		}
		
		System.out.println(ans);
		
		
	}
}
