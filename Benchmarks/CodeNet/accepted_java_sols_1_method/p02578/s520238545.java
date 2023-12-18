
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			long sum = 0;
			long prev = 0;
			
			for(int i = 0 ; i < n ; i++ ) {
				long current = sc.nextLong();
				
				if ( current < prev ) {
					sum += prev - current;
				}
				else {
					prev = current;
				}
			}
			
			System.out.println(sum);
		}
	}

}