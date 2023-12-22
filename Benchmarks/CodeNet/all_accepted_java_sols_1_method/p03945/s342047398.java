import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char prev = 'x';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != prev) {
				count++;
				prev = s.charAt(i);
			}
		}
		System.out.println(count - 1);
	}
}
