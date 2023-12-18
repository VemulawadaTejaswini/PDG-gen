import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a[] = new int[n];
		int ans = 0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=1;i--) {
			ans += a[i];
		}
		
		System.out.println(ans);
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 
