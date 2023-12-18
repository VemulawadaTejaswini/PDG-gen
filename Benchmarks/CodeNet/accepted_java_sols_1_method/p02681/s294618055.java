import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		int a = t.length();
		int b = s.length();
		
		String x = t.substring(0,a-1);
		
		if(s.equals(x) && b+1 == a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		

	}
}
