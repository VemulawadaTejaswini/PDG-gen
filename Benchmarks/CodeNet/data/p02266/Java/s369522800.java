import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		reader.close();

		Stack<Integer> st1 = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();
		Stack<Integer> st3 = new Stack<Integer>();
		
		int lv = 0;
		for (int i=0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '\\') {
				lv--;
				st1.add(i);
			} else if (c == '/') {
				lv++;
				if (!st1.isEmpty()) {
					int newArea = i - st1.pop();
					int tmp = 0;
					while (!st2.isEmpty() && st3.peek() < lv) {
						st3.pop();
						tmp += st2.pop();
					}
					st2.push(newArea + tmp);
					st3.push(lv);
				} else if (!st3.isEmpty()) {
					st3.pop();
					st3.push(lv);
				}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		int totalArea = 0;
		int n = st2.size();
		sb.append(n);
		for (int i = 0; i < n; i++) {
			totalArea += st2.get(i);
			sb.append(" " + st2.get(i));
		}
		System.out.println(totalArea);
		System.out.println(sb.toString());
	}
}
