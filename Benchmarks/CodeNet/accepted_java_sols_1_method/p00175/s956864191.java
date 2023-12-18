
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == -1)
				break;
			Deque<Integer> deque = new ArrayDeque<Integer>();
			while (true) {
				int a = n % 4;
				deque.push(a);
				n /= 4;
				if (n == 0)
					break;
			}
			for (int t : deque)
				System.out.print(t);
			System.out.println();
		}
	}
}