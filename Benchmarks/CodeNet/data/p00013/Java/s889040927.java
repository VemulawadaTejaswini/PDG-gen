import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		try {
			while ((s = br.readLine()) != null) {
				list.add(Integer.parseInt(s));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Integer i : list) {
			if (i > 0) {
				stack.push(i);
			} else {
				System.out.println(stack.pop());
			}
		}
	}
}