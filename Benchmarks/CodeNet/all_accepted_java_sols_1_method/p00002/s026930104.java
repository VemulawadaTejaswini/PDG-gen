import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			int c = a + b;
			int i;
			
			for(i = 1; ; i++) {
				if(c < 10) {
					break;
				}
				c = c / 10;
				
			}
			
			System.out.println(i);
		}
		
	}
}