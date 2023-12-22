import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		String u = t.substring(0, s.length());
		
		System.out.println( s.equals(u) ? "Yes" : "No");
	}
}