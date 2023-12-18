import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		sc.close();

		Deque<Integer> dq = new ArrayDeque<>();

		for(String val : inputs) {

			if(isInt(val)) {
				int num = Integer.parseInt(val);
				dq.push(num);
			} else {
				calc(dq, val);
			}
		}

		System.out.println(dq.pop());

	}

	private static void calc(Deque<Integer> dq, String val) {

		char ope = val.charAt(0);
		int b = dq.pop();
		int a = dq.pop();

		switch (ope) {
		case '+':
			dq.push(a + b);
			break;
		case '-':
			dq.push(a - b);
			break;
		case '*':
			dq.push(a * b);
			break;
		default:
			break;
		}

	}

	private static boolean isInt(String val) {

		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}