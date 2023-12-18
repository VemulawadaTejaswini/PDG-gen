import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long ax = Math.abs(x);
		long xk = ax/d;
		long xkk = Math.min(k, xk);
		
		ax = Math.abs(ax - d*xkk);;
		if( (k-xkk) % 2 == 1 ) {
			ax = Math.abs(ax - d);
		}
		
		System.out.println(ax);
	}
}
