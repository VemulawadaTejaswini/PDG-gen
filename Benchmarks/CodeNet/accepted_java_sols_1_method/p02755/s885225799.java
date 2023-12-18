import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
		
			for(int i = 1 ; i < 1500 ; i++ ) {
				
				int taxA = (int)Math.floor((double)i * 8 / 100);
				int taxB = (int)Math.floor((double)i / 10);
				
				
				if ( taxA == a && taxB == b) {
					System.out.println(i);
					return;
				}
			}
			
			System.out.println(-1);
			
		}
	}
}