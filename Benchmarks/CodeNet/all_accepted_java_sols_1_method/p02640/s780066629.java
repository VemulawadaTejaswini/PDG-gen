//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		boolean ok = false;
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(2*i+4*j==Y&&i+j==X) {
					
					ok = true;
					break;
				}
			}
		}
		if(ok) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}