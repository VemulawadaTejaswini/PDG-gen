import java.util.*;
import java.lang.Math.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int gcd;
		gcd = gcd(x, y);
		System.out.println(gcd);
	}

	public static int gcd(int x, int  y){
		int r;
		if(x < y){
			int tmp = x;
			x = y;
			y = tmp;
		}
		while(y > 0){
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

	public static int gcdB(int x, int y){
		int n = Math.min(x, y);
		for(int d = n; d > 0; d--){
			if((x % d == 0) && (y % d == 0)){
				return d;
			}
		}
	return -1;
	}
}