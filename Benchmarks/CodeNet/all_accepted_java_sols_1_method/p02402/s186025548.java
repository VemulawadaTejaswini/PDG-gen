import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int count = sc.nextInt();
		
		int min		= 1000000;
		int max		= -1000000;
		long calc	= 0;
		
		for(int i = 0; i < count; i++) {
			int a = sc.nextInt();
			
			calc += a;
			
			if( a > max ) {
				max = a;
				
			}
			if ( a < min ) {
				min = a;
			}
				
		}
		System.out.println(min+" "+max+" "+calc);
		
	}
}