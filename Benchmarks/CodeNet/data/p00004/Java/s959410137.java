
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		int a,b,c,d,e,f;
		
		while (sc.hasNext()) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
			
			System.out.println( (double)(e*c-b*f)/(a*e-b*d) + " " + (double)(a*f-c*d)/(a*e-b*d) );
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}