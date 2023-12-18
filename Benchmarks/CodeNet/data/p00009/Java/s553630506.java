import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		int n;
		boolean[] p;
		int count;
		
		while (sc.hasNext()) {
			
			n = sc.nextInt();
			
			if ( n <2 ) {
				System.out.println(0);
				continue;
			}
			
			p = new boolean [n+1];
			
			for(int i=0;i<=n;i++) {
				p[i] = true;
			}
			
			count = 0;
			
			for (int i=2;i<=n;i++) {
				
				if ( p[i] ) {
					
					count++;
					
					for (int j=2;j<=n/i;j++) {
						
						p[j*i] = false; 
						
					}
				}
			}
			
			System.out.println(count);
		
		}
	}
	
	public static void main(String[] args) {
		
		new Main().run();
		
	}
	
}