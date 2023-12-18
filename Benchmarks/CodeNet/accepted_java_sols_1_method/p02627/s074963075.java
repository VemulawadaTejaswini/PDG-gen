import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String n = scan.next();
		if(n.matches("[A-Z]")) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
 
}