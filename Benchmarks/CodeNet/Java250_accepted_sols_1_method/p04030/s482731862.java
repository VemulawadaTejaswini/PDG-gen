import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<String> txt = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1')
				txt.add(s.substring(i, i + 1));
			else if (!txt.isEmpty())
				txt.remove(txt.size() - 1);
		}
		for (int i = 0; i < txt.size(); i++)
			System.out.print(txt.get(i));
		System.out.println("");
	}
}