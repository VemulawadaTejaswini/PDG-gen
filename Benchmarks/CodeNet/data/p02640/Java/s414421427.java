import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(), y = scan.nextInt();
		
		int z = y - 2 * x;
				
		if(z % 2 != 0) {
			System.out.println("No");
		}else {
			z = z / 2;
			
			if(2 * (x + z) != y) {
				System.out.println("No");
				
			}else if(x < z) {
				System.out.println("No");
				
			}else {
				System.out.println("Yes");
				
			}
			
		}
		
		
		
	}
		
	
}
