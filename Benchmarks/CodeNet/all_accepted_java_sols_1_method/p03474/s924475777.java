import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		String regex = "\\d{" + stdin.nextInt() + "}-\\d{" + stdin.nextInt() + "}";
		String result = "No";
		if (stdin.next().matches(regex)) {
			result = "Yes";
		}

		System.out.println(result);
	}

}
