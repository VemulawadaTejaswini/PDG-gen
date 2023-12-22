import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<Integer> garage = new Stack<Integer>();
		while ((scan.hasNext())) {
			int num = scan.nextInt();
			if (num != 0) {
				garage.push(num);
			} else {
				System.out.println(garage.pop());
			}

		}
	}
}