import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n == 0) {
			System.out.println(0);
			return;
		}
		Deque<Integer> q = new ArrayDeque<Integer>();
		StringBuilder st = new StringBuilder();
		while (true) {
			if (n == 0) {
				q.push(n%-2);
				break;
			}
			if (n%-2 < 0) {
				if (n%-2 == 0) {
					st.append('0');
				} else {
					st.append('1');
				}
				n = (n/-2)+1;
			} else {
				if (n%-2 == 0) {
					st.append('0');
				} else {
					st.append('1');
				}
				n /= -2;
			}
		}
		System.out.print(st.reverse());
	}
}
