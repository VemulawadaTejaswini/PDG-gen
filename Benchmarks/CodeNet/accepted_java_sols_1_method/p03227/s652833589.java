import java.util.*;
public class Main {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		// get a integer
		String a = sc.next();
		
		StringBuilder b = new StringBuilder();
		b.append(a);
		b = b.reverse();
		
		if(a.length() == 2) {
			System.out.println(a);
		} else if (b.length() == 3){
			System.out.println(b);
		}
	}
}