import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();

		for (int i = 0; i < c.length; i++) {
			char a = c[i];
			if (i % 2 == 0) {
				if (!(a == 'R' || a == 'U' || a == 'D')) {
					System.out.println("No");
					return;
				}
			} else {
				if (!(a == 'L' || a == 'U' || a == 'D')) {
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");
	}
}
