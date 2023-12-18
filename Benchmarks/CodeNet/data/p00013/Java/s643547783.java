import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
			Integer input = scan.nextInt();
			if(input == 0) {
				System.out.println(stack.pop());
			} else {
				stack.push(input);
			}
		}

		scan.close();

	}

}
