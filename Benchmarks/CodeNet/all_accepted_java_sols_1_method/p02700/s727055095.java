
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		int A,B,C,D;
		
		A = cin.nextInt();
		B = cin.nextInt();
		C = cin.nextInt();
		D = cin.nextInt();
		
		while(true) {
			
			C -= B;
			if(C<=0) {
				System.out.println("Yes");
				return;
			}
			A -= D;
			if(A<=0) {
				System.out.println("No");
				return;
			}
			
		}
		
		
	}

}
