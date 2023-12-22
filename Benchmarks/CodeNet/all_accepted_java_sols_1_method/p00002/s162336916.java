import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a + b;

			int l = 0;

			while (c != 0) {
				++l;
				c /= 10;
			}

			System.out.println(l);
		}
	}

}