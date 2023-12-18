import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i))
				count += 1;
		}

		System.out.println(count);
		kb.close();
	}

}
