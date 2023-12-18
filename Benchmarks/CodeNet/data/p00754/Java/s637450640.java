import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split("");

			if (str[0].equals("."))
				break;

			boolean flag = true;
			Deque<String> stack = new ArrayDeque<>();
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals("(")) {
					stack.push("(");
				} else if (str[i].equals("[")) {
					stack.push("[");
				} else {
					if (str[i].equals(")")) {
						if (stack.size() <= 0 || !stack.poll().equals("(")) {
							flag = false;
							break;
						}
					} else if (str[i].equals("]")) {
						if (stack.size() <= 0 || !stack.poll().equals("[")) {
							flag = false;
							break;
						}
					}
				}
			}
			if (stack.size() > 0)
				flag = false;
			if (flag)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
