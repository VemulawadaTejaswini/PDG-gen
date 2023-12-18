import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String a="";
		for( int i = 0; i < n; i++) {
			a += (char)s.charAt(i);
			a += (char)t.charAt(i);
		}
		System.out.println(a);
	}
}
