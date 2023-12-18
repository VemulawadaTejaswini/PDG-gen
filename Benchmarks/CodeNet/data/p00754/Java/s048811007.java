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
				
				for(int r = 0; r < str.length(); r++) {
					char look = str.charAt(r);
					
					if(look == ' ') continue; //空白文字は無視
					if(look == '(' || look == '[') { //最初のカッコの時
						stack.add(look);
						if(look == '(') check.add(')'); //対となるはずであるものを格納しておく
						else if(look == '[') check.add(']'); //対となるはずであるものを格納しておく
					} else if(look == ')' || look == ']') { //最後のカッコの時
						char ch = '.'; 
						if(!stack.isEmpty()) ch = check.pop();
						if(look != ch || stack.isEmpty()) {
							ans = false;
							continue;//来るべきである文字と一致しているか
						}
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