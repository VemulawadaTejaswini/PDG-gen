import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.substring(0, s.length() - 1);
		if (s.length() % 2 != 0)
			s = s.substring(0, s.length() - 1);
		while (!s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2 , s.length())))
			s = s.substring(0, s.length() - 2);
		System.out.println(s.length());
	}
}