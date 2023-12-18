import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String str = s.nextLine();
			if(".".equals(str))
				break;
			solve(str);
		}
	}

	public static void solve(String str) {
		Deque stack = new ArrayDeque();
		Deque round = new ArrayDeque();
		for(int i=0 ; i<str.length() ; i++) {
			String c = str.substring(i, i+1);
			if("(".equals(c)) {
				round.push("(");
			}else if(")".equals(c)) {
				Object o = round.poll();
				if(o == null) {
					System.out.println("no");
					return;
				}
			}else if("[".equals(c)) {
				stack.push("[");
			}else if("]".equals(c)) {
				Object so = stack.poll();
				if(so == null) {
					System.out.println("no");
					return;
				}
			}
		}
		if(! stack.isEmpty()) {
			System.out.println("no");
			return;
		}
		if(! round.isEmpty()) {
			System.out.println("no");
			return;
		}
		System.out.println("yes");
	}
}