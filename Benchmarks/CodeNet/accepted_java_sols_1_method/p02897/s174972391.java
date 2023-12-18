import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd_counter =0;
		int even_counter =0;
		
		for( int m = 1 ; m <= n; m++) {
			
			if ( m % 2 == 1 ) {
				odd_counter  = odd_counter + 1;
			}
			else {	
				even_counter = even_counter + 1;		
			}	
			
		}	
		float k = (float) odd_counter / (float)(odd_counter + even_counter);
		System.out.println(k);
	 }
}