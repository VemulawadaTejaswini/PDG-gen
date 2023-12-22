import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String c = s.next();
		
		if(a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
