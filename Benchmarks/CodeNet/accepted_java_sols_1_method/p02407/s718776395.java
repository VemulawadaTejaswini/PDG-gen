import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			
			Deque<Integer> deque = new ArrayDeque<>();
			
			for(int i = 0; i < n; i++) {
				deque.push(sc.nextInt());
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < n; i++) {
				sb.append(deque.pop());
				if(i < n - 1) {
					sb.append(" ");
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}
