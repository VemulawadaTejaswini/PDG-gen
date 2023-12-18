
import java.util.*;
import java.lang.*;
import java.math.*;

class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int x;
		
		while ( sc.hasNextInt() ) {
			x = sc.nextInt() + sc.nextInt();
			
			
			
			int count = 0;
			
			do{
				x /= 10;
				count++;
			} while ( x != 0);
			
			
			System.out.println(count);
			
		}
		return;

	}

	public static void main(String[] args) {
		new Main().run();
	}
}