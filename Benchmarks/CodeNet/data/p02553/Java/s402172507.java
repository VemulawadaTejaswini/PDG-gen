import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long num[] = new long[4];
		long ans = 0;
		
		for(int i=0;i<4;i++) {
			num[i] = scan.nextLong();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<4;j++) {
				long kari = num[i]*num[j];
				ans = Math.max(kari, ans);
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
 



