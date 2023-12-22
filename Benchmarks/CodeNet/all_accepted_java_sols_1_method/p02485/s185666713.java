import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String in = "";
		int result = 0;
		while (true) {
			try {
				in = stdin.next();
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("Unexpected Error");
			}
			if (in.equals("0"))
				break;

			for (int i = 0; i < in.length(); ++i)
				result += Integer.parseInt(in.substring(i, i + 1));
			System.out.println(result);
			result = 0;
		}
		stdin.close();
	}
}