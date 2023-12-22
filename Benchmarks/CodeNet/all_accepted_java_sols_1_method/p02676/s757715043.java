
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		if(s.length() <= k) {
			System.out.println(s);
		}
		else {
			sb.replace(k, s.length(), "...");
			s = sb.toString();
			System.out.println(s);
		}
	}

}
