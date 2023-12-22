import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		String sub = s.substring(1, s.length()-1);
		//System.out.println(sub);
		int count = sub.length();

		System.out.println(s.substring(0,1) + count + s.substring(count+1, s.length()));
	}

}