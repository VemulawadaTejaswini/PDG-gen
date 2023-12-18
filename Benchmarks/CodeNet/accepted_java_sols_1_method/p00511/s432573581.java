
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<>();
		s.push(sc.next());
		while(sc.hasNext()) {
			String str = sc.next();
			if(str.equals("=")) {
				System.out.println(s.pop());
				break;
			}
			if(!Character.isDigit(str.charAt(0))) {
				s.push(str);
			}
				
			else {
				String ss = s.pop();
				int a = Integer.parseInt(s.pop());
				int b = 0;
				if(ss.equals("+"))
					b = a + Integer.parseInt(str);
				if(ss.equals("-"))
					b = a - Integer.parseInt(str);
				if(ss.equals("*"))
					b = a * Integer.parseInt(str);
				if(ss.equals("/"))
					b = a / Integer.parseInt(str);
				s.push(String.valueOf(b));
			}
			
		}
	}
}
