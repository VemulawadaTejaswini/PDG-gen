import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		int answer = 0;
		
		int n = in.nextInt();
		String s = in.next();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				x++;
			} else {
				x--;
			}
			answer = Math.max(answer, x);
		}
		System.out.println(answer);
	}
}