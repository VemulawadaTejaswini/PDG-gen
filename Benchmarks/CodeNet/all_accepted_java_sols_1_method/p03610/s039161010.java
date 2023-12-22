import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i+=2) {
			sb.append(s.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
}