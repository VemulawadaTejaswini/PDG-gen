import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long X = scan.nextLong();
			
			
			long a = 100;
			int count = 0;
			while(true) {
				
				a = (long)((double)a*1.01);
				count++;
				
				if(X<=a)break;
			}
			
			
			System.out.println(count);
			
		}
		
		
	}
		

}
