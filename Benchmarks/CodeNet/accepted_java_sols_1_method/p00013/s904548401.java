import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>();

		while (sc.hasNext()) {
			String num = sc.nextLine();
			if (num.equals("0"))
				System.out.println(s.pop());
			else
				s.add(num);

		}
	}

}