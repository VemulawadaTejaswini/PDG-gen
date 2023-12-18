import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(stdin.hasNext()){
			String line = stdin.next();
			if (line.equals(".")) break;
			System.out.println(yesOrNo(isBalanced(line)));
		}
		System.exit(0);
	}
	private static String yesOrNo(boolean b){
		return b ? "yes" : "no";
	}
	private static boolean isBalanced(String line){
		bracketStuck bs = new bracketStuck();
		for(int i = 0; i < line.length(); i++){
			char c = line.charAt(i);
			if (c == '(' || c == ')' || c == '[' || c == ']') {
				if (! bs.processBracket(c)) return false;
			}
		}
		return true;
	}
}

class bracketStuck {
	private ArrayList<Boolean> st = new ArrayList<Boolean>();
	private void push(boolean b) {
		st.add(b);
	}
	private boolean pop(){
		boolean b = st.get(st.size() - 1);
		st.remove(st.size() - 1);
		return b;
	}
	public boolean processBracket(char c) {
		switch (c) {
		case '(':
			this.push(true);
			return true;
		case '[':
			this.push(false);
			return true;
		case ')':
			if (this.pop()) return true;
			else return false;
		case ']':
			if (this.pop()) return false;
			else return true;
		default:
			return false;
		}
	}
}