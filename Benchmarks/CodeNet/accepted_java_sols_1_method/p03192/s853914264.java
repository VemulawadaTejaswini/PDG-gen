import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String N = in.nextLine();
		int count = 0;
		for (int i = 0; i < N.length(); ++i) {
			if (N.charAt(i) == '2') {
				++count;
			}
		}
		System.out.println(count);

	}

}