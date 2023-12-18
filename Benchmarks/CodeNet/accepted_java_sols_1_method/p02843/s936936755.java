import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
 
		int max = X/100;
		int min = (X+104)/105;
		for(int i=min;i<=max;i++) {
			double rem = (double)(X-100*i);
			if( (rem/i)<= 5.0) {
				System.out.println(1);
				return;
			}
		}
		
		System.out.println(0);
		
	}
	
}