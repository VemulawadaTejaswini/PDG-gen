import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine(); 
		if(s.equals("BBB") || s.equals("AAA"))
			System.out.println("No"); 
		else System.out.println("Yes"); 
	}
}