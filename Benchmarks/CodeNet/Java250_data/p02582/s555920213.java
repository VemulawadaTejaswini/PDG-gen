import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		int maxR = 0, currR = 0;
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (curr == 'S') {
				currR = 0;
			}
			else {
				currR++;
				maxR = Math.max(maxR, currR);
			}
		}
		System.out.println(maxR);
		
		reader.close();
	}
	
}
