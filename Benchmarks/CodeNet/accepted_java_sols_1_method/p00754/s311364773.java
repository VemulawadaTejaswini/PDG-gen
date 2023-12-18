import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(Pattern.compile("\\n"));

		while (true) {
			//Pattern p = p.compile("\n");
			String s = sc.next();
			boolean f = true;
			Stack<String> st = new Stack<String>();
			if (s.charAt(0) == '.') {
				break;
			}
			
			for (int i = 0; i < s.length(); i++) {
				char c[] = new char[1];
				c[0] = s.charAt(i);
				String s2 = new String(c);
				if (s2.equals("(") || s2.equals("[")) {
					st.push(s2);
				} else if (s2.equals(")")) {
					try {
						String s3 = st.pop();
						if (!s3.equals("(")) {
							f = false;
						}
					} catch(EmptyStackException e) {
						f = false;
						break;
					}
				} else if (s2.equals("]")) {
					try {
						String s3 = st.pop();
						if (!s3.equals("[")) {
							f = false;
						}
					} catch(EmptyStackException e) {
						f = false;
						break;
					}
				}
			}
			if (st.empty() == false) {
				f = false;
			}
			if (f) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}