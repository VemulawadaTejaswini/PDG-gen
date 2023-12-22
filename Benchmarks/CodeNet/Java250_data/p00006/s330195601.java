import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println( reverse_str( sc.nextLine() ) );
		sc.close();
	}

	private static String reverse_str(String nextLine) {
		String str = nextLine;
		StringBuffer sb = new StringBuffer();

			for (int i = 0; i < str.length(); i++) {
				sb.append( str.charAt(str.length() - ( 1 + i ) ) );
			}

		String rev_str = sb.toString();

		return rev_str;
	}
}
