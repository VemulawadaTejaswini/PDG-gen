
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b, c;
		StringBuilder ans = new StringBuilder();
		
		a = sc.next();
		b = sc.next();
		c = sc.next();
		
		sc.close();
		
		a = a.toUpperCase();
		b = b.toUpperCase();
		c = c.toUpperCase();
		
		ans.append(a.charAt(0));
		ans.append(b.charAt(0));
		ans.append(c.charAt(0));
		
		System.out.println(ans);
	}

}
