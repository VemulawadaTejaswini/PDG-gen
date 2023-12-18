import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		int count = 0;
		long fact =0;long output=0;
		//System.out.println("hello");
		
		if(n % 2 ==0) {
			System.out.println("-1");
			System.exit(0);
			
		}
		
		for(long i = 0;output < n;i++ ) {
			
			fact = fact*10+7;
			output++;
			if(fact % n == 0) {
				
				System.out.println(output);
				break;
			}
			
			
		}
	}

}
