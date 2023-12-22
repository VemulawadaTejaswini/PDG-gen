
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		long x,y,z;
		long first,second;
		long tmp;
		
		while (sc.hasNext()) {
			
			first = sc.nextLong();
			second = sc.nextLong();
			
			x = first;
			y = second;
			
			if (x<y) {
				tmp = x;
				x = y;
				y = tmp;
			}
			
			do {
				z = x % y;
				x = y;
				y = z;
			} while (z!=0);
			
			System.out.println(x + " " + first * second / x );
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}