import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int counter = 0;
		
		
		for(int i = a;i <= b;i++) {
			if(c % i == 0) {
				counter = counter + 1;
				
						
			}
		}
		
		System.out.println(counter);
		

		
				
	}
}
