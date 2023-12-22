import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			long d = sc.nextLong();
			long d2 = d * d;
			
			int count = 0; 
			for(int i = 0 ; i < n ; i++ ) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				
				if ( x * x + y * y <= d2 ) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}