import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		long inX = stdin.nextLong();
		long inY = stdin.nextLong();

		int length = 0;
		for (; inX <= inY; inX *= 2) {
			length++;
		}

		System.out.println(length);
	}

}
