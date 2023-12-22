import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();
		long ans = 0;
		boolean loop = true;
		
		if(n == 0) {
			loop = false;
		}
      
      	if(k == 1) {
			loop = false;
		}
      	long x = n;
		if(x > k) {
			long a = x / k;
			x = x - (k * a);
			if(x == 0) {
				loop = false;
			}
		} else if(x == k){
			loop = false;
		}
      	
		long pre = x;
		while(loop) {			
			x = x - k;
			if( x == 0) {
				loop = false;
			}
			if(x < 0) {
				loop = false;
                x = Math.abs(x);
				if(x < pre) {
					ans = x;
				} else {
					ans = pre;
				}
			}
			
			pre = Math.abs(x);
		}
				
		System.out.println(ans);
	}
}