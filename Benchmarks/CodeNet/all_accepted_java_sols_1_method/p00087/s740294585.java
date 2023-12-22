import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				Stack<Double> stack = new Stack<Double>();
				StringTokenizer st = new StringTokenizer(buf);
				while (st.hasMoreTokens()) {
					String s = st.nextToken();
					if (s.equals("+")) {
						double b = stack.pop();
						double a = stack.pop();
						stack.push(a+b);
					} else if (s.equals("-")) {
						double b = stack.pop();
						double a = stack.pop();
						stack.push(a-b);
					} else if (s.equals("*")) {
						double b = stack.pop();
						double a = stack.pop();
						stack.push(a*b);
					} else if (s.equals("/")) {
						double b = stack.pop();
						double a = stack.pop();
						stack.push(a/b);
					} else {
						stack.push(Double.parseDouble(s));
					}
				}
				System.out.println(stack.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}