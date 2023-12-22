import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sl = s.split("");
		int c = 0;
		for (int i = 0; i < sl.length; i++) {
			if (sl[i].equals("1")) {
				c += 1;
			}
		} System.out.println(c);

		}
	}