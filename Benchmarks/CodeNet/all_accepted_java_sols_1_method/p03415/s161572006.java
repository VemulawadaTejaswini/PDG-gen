import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] c = new String[3];
		for (int i = 0; i < 3; i++)
			c[i] = sc.next();
		sc.close();

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 3; i++)
			s.append(c[i].charAt(i));
		System.out.println(s);
	}
}