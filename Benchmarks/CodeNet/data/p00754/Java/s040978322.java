import java.util.*;
import java.io.*;
public class Main {
	void doIt() {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader din = new BufferedReader(read);

		try {
			while(true) {
				Stack<Character> stack = new Stack<Character>();
				Stack<Character> check = new Stack<Character>();
				boolean ans = true;
				String str = din.readLine();

				if(str.charAt(0) == '.') break;
				char ch = '\n';
				for(int r = 0; r < str.length(); r++) {
					char look = str.charAt(r);
					if(look == ' ') continue;
					if(look == '(' || look == '[') {
						stack.add(look);
						if(look == '(') check.add(')');
						else if(look == '[') check.add(']');
					} else if(look == ')' || look == ']') {
						if(!stack.isEmpty()) ch = check.pop();
						if(look != ch || stack.empty()) continue;
						stack.pop();
					}
				}
				if(!stack.isEmpty() || !check.isEmpty()) ans = false;
				System.out.println((ans) ? "yes" : "no");
			}
		}catch(IOException e) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}