import java.util.*;   
import java.lang.*;   
import java.math.*;   
import java.io.*; 

public class Main {
	Scanner sc;
	
	void run() {
		sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int d = sc.nextInt();
			int sum = 0;
			for (int i=0;i<600/d;i++) {
				sum += d * ( y_x2(i*d) );
			}
			System.out.println(sum);
		}
		
		
	}
	
	public int y_x2(int x) {
		return x*x;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}