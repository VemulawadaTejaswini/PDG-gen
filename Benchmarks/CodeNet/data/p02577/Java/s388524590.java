import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String n = reader.next();
		int total = 0;
		for (int i = 0; i < n.length(); i++) {
			total += Integer.parseInt("" + n.charAt(i));
		}
		if (total % 9 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		reader.close();
	}
	
}
