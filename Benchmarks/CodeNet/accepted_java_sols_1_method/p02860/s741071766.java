import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		String p = "";
		String q = "";
		String k = "Yes";
		if (s.length() % 2 == 1) {
			k = "No";
		} else {
			for (int i = 0; i < s.length() / 2; i++) {
				p += s.charAt(i);
			}
			for (int i = s.length() / 2; i < s.length(); i++) {
				q += s.charAt(i);
			}
			if (!p.equals(q))
				k = "No";
		}
		System.out.println(k);
		kb.close();
	}

}
