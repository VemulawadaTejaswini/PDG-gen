import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String[] ary = s.split(" ");
		int l = ary.length;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for(int i = 0; i < l; i++) {
			String t = ary[i];
			if(t.equals("+")) {
				int a = stack.pop();
				int b = stack.pop();
				int c = b + a;
				stack.push(c);
			}else if(t.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				int c = b - a;
				stack.push(c);
			}else if(t.equals("*")) {
				int a = stack.pop();
				int b = stack.pop();
				int c = b * a;
				stack.push(c);
			}else {
				int a = Integer.parseInt(t);
				stack.push(a);
			}
		}
		int ans = stack.pop();
		System.out.println(ans);
	}
}
