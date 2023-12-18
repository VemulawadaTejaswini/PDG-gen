import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			
			if (i>=11) {
				int x=i/10;
				if ((x%10==3) || (x%3==0) || (x%3==0)){
					System.out.print( " "+i );

				} 
				
			} else {
				if ((i%10==3) || (i%3==0)){
					System.out.print( " "+i );

				}
			}
			
			
			
		}

	}

}