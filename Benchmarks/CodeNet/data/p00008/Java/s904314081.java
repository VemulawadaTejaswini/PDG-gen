import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		
		int n ;
		int count = 0;
		
		while( sc.hasNext() ) {
			
			n = sc.nextInt();
			count = 0;
			
			for (int i=0;i<10;i++) {
				for (int j=0;j<10;j++) {
					for (int k=0;k<10;k++) {
						for (int l=0;l<10;l++) {
							
							if ( n == i+ j + k + l  )
								count++;
							
						}
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