import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] c = N.toCharArray();
		sc.close();
		for (int i = 0; i < 3; i++) {
			if (c[i] == '7') {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
