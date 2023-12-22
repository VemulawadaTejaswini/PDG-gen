import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String c1 = sc.next();
		String c2 = sc.next();
		
		if (c1.toCharArray()[0] == c2.toCharArray()[2] &&
		    c1.toCharArray()[1] == c2.toCharArray()[1] && 
		    c1.toCharArray()[2] == c2.toCharArray()[0]) {
			
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
