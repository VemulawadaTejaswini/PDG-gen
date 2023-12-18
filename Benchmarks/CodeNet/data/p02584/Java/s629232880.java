import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		long oppai[] = new long[2];
		oppai[0] = x;
		
		for(int i=0;i<k;i++) {
			if(Math.abs(x-d) < Math.abs(x+d)) {
				x = x-d;
			}else {
				x = x+d;
			}
			if(i == 0) {
				oppai[1] = x;
				continue;
			}else {
				if(oppai[0] == x) {
					break;
				}else {
					oppai[0] = oppai[1];
					oppai[1] = x;
				}
			}
		}
		
		if(k == 1) {
			System.out.println(x);
		}else {
			System.out.println(Math.abs(oppai[(int)k%2]));
		}
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



