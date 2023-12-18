import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long num[] = new long[4];
		long ans = 0;
		
		for(int i=0;i<4;i++) {
			num[i] = scan.nextLong();
		}
		
		for(int i=0;i<2;i++) {
			for(int j=2;j<4;j++) {
				long kari = num[i]*num[j];
				if(i==0 && j==2) {
					ans = kari;
				}else {
					ans = Math.max(kari, ans);
				}
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
 



