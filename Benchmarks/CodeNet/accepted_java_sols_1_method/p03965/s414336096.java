import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int gCount = 0;
		int pCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'g') {
				gCount++;
			} else {
				pCount++;
			}
		}
		int maxp = (gCount + pCount) / 2;
		System.out.println(maxp - pCount);
	}
}
