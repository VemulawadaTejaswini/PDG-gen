import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		String inS = stdin.next();
		int min = inS.length();
		for (int i = 0; i < (inS.length() - 1); i++) {
			if (inS.charAt(i) != inS.charAt(i + 1)) {
				min = Math.min(min, Math.max((i + 1), (inS.length() - i - 1)));
			}
		}

		System.out.println(min);
	}

}
