import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int r = scan.nextInt();
		int d = scan.nextInt();
		int ans = 0;
		
		for(int i=l;i<=r;i++) {
			if(i%d==0) {
				ans++;
			}
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
 