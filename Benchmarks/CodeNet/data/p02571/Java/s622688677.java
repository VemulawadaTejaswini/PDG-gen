import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.next(), t = reader.next();
		int minChanges = Integer.MAX_VALUE;
		for (int i = 0; i < s.length() - t.length() + 1; i++) {
			int changes = 0;
			for (int k = 0; k < t.length(); k++) {
				if (t.charAt(k) != s.charAt(k + i)) {
					changes++;
				}
			}
			minChanges = Math.min(minChanges, changes);
		}
		System.out.println(minChanges);
		reader.close();
	}
	
}
