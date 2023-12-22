
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String s = sc.next();
		int loss = 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='x') {
				loss++;
			}
		}
		System.out.println(loss>=8 ? "NO" : "YES");
	}
}
