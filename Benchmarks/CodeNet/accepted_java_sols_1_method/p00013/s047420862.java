import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<Integer>();
		while(sc.hasNext()) {
			int q = sc.nextInt();
			if (q == 0) {
				System.out.println(stack.pop());
			}else{
				stack.push(q);
			}
		}
	}

}