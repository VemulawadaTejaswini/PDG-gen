import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			if (str.equals("#"))
				break;
			char[] c = new char[str.length()];
			for (int i = 0; i < str.length(); i++)
				switch (str.charAt(i)) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'z':
					c[i] = 'r';
					break;
				default:
					c[i] = 'l';
					break;
				}
			int a = 0;
			char ci = c[0];
			for (int i = 0; i < str.length(); i++)
				if (c[i] != ci) {
					a++;
					ci = c[i];
				}
			System.out.println(a);
		}
		sc.close();
	}
}