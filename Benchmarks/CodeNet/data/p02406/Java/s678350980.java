import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int  n = scanner.nextInt();	
	  	boolean j = true;
	  
	  	
	  	for(int i = 1 ; i <= n ; i ++) {
			if(i %10 == 3 || i % 3 == 0 ) {
				System.out.print(" " + i);
				j = false;
			}
			if( j && i % 100 > 30 && i % 100 <  40) {
				System.out.print(" " + i);
				j = false;
			}
			if( j && i % 1000 > 30 && i % 1000 <  40) {
				System.out.print(" " + i);
				j = false;
			}
			if( j && i % 10000 > 30 && i % 10000 <  40) {
				System.out.print(" " + i);
				j = false;
			}
			
			if(!j)
				j = true;
			
	  	}
		System.out.print("\n");
        scanner.close();
	}
}
