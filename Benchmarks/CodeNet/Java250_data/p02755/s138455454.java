import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int eight = scan.nextInt(), ten = scan.nextInt();
		
		for(int i = ten * 10; i < ten * 10 + 10; i++) {
			if((int)(i * 0.08) == eight) {
				System.out.println(i);
				System.exit(0);
				
			}
			
		}
		
		System.out.println(-1);
		
	}
	
}



