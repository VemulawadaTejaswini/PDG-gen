import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> count = new Stack<>(); 
		boolean flag = true;

		while(sc.hasNextLine()){
			String s = sc.nextLine();

			LABEL:
				for(int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if(i==0 && c=='.') {
						flag = false;
						break LABEL;
					}
					switch(c) {
					case '(':
						count.push(')');
						break;
					case '[':
						count.push(']');
						break;
					case ')':
					case ']':
						if(count.isEmpty() || count.peek() != c) {
							flag = false;
							break LABEL;
						}else {
							count.pop();
						}
					}
				}
		}

		if(count.isEmpty() && flag==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}	

