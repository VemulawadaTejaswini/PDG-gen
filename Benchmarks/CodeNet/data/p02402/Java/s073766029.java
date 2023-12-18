import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int count = sc.nextInt();
		
		int min		= 0;
		int max		= 0;
		int calc	= 0;
		
		for(int i = 0; i < count; i++) {
			int a = sc.nextInt();
			
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