import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] c = new char[2][];
		for (int i = 0; i < 2; i++) {
			c[i] = sc.next().toCharArray();
		}
		if (c[0][0] == c[1][2] && c[0][1] == c[1][1] && c[0][2] == c[1][0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
