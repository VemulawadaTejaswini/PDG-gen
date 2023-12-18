import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n == 0) {
			System.out.println(0);
			return;
		}
		StringBuilder st = new StringBuilder();
		while (true) {
			if (n == 0) break;
			if (n%-2 == 0) {
				st.append('0');
			} else {
				st.append('1');
			}
			if (n%-2 < 0) n = (n/-2)+1;
			else n /= -2;
		}
		System.out.print(st.reverse());
	}
}
