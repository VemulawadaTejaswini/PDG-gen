import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	/*	int n = stdIn.nextInt();
		int a = 10;
		
		for(int i = 1; i <= 9; i++) {
			if(n%i == 0) {
				 a = n/i;
			}
			if(a<10) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
		
		
		
		*/
		
		int n = stdIn.nextInt();
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(n==i*j) {
					System.out.println("Yes");
                  System.exit(0);
				}
			}
		}
		System.out.println("No");
		
		
		
		
	}

}
