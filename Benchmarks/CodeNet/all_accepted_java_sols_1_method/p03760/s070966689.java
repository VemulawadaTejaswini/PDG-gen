import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		String m = "";
		for (int i = 0 ; i < o.length() ; i++) {
			m += o.charAt(i);
			if (i == e.length()) {
				break;
			}else {
				m += e.charAt(i);
			}
		}
		System.out.println(m);
	}
}