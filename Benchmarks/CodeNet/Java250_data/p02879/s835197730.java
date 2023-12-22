
import java.util.*;

public class Main {


	public static void main (String [] args) {
		
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			a = sc.nextInt();			
		}while(!((a >= 1)&&(a <= 20)));
		
		do {
			b = sc.nextInt();			
		}while(!((b >= 1)&&(b <= 20)));
		
		
		if((a>=1 && a<=9) && (b>=1 && b<=9) ) {
			
			System.out.println(a*b);
			
		}else {
			System.out.println(-1);
		}
		
		
	}
}
		