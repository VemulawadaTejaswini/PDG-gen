import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		
		
	}
}
 
