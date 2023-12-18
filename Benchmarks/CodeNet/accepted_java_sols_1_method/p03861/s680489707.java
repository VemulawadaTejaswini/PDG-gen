import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long a = scan.nextLong();
			long b = scan.nextLong();
			long x = scan.nextLong();
			
			long B = b==0?1:b/x+1;
			long A = a==0?1:a/x+1;
			if(a%x==0)A--;
			
			
			System.out.println(B-A);
			
			
			
		}
		
		
	}
		

}
