import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		boolean j = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				j = false;
				break;
			}
		}
		if (j && (s.length() + 1 == t.length())) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
		kb.close();
	}

}
