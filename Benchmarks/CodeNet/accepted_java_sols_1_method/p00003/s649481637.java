import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		for (int x = 0 ; x < n ; x++){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int [] array = new int [] {a,b,c};
			Arrays.sort(array);
			
			int a2 = array[0];
			int b2 = array[1];
			int c2 = array[2];
			
			if( a2 * a2 + b2 * b2 == c2 * c2 ){
				System.out.println( "YES" );
				}else{
					System.out.println( "NO" );
				}
			
		}
	}

}