import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int count = sc.nextInt();
		
		long min		= 0;
		long max		= 0;
		long calc	= 0;
		
		for(int i = 0; i < count; i++) {
			long a = sc.nextInt();
			
			calc += a;
			
			if( i==0 ){
				min		= a;
				max		= a;
				
			} else {
				if( a > max ) {
					max = a;
				} else if ( a < min ) {
					min = a;
				}
				
			}
						
		}
		
		System.out.printf("%d %d %d", min, max, calc);
		
	}
}