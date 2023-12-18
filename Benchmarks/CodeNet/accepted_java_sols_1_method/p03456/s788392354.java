import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		a += b;
		int c = Integer.parseInt(a);
		if((double)Math.sqrt(c) == (int)Math.sqrt(c)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}