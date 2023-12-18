import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = a - 2*b;
			
			if (result < 0 ) 
				result = 0;
			
			System.out.println(result);
			
		}
	}
}
