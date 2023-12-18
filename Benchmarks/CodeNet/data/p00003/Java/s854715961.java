
import java.util.*;
import java.lang.*;
import java.math.*;

class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int[] x = new int[3];
		
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			
			for (int j=0; j<3;j++) {
				
				x[j] = sc.nextInt();
				x[j] *= x[j];
				
			}
			
			Arrays.sort(x);
			
			if ( x[0] + x[1] == x[2] )
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}
		
		return;

	}

	public static void main(String[] args) {
		new Main().run();
	}
}