import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				list.add(s.pop());
				if (s.size() == 0) break;
			} else
				s.add(n);
		}

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}