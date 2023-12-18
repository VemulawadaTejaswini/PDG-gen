import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		long a = 0;
		
		for(int i=0;i<n.length();i++) {
			a += n.charAt(i)-48;
		}
		
		if(a%9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 





