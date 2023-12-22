import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String z = s.next();
		int r = 0;
		for(int i=0;i * 2 < z.length();i++) {
			if (z.charAt(i) != z.charAt(z.length() - 1 - i)) ++r;
		}
		System.out.println(r);
	}

}
