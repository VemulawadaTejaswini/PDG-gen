import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] ary = sc.nextLine().split(" ");
			int l = ary.length;
			Deque<Double> stack = new ArrayDeque<Double>();
			for(int i = 0; i < l; i++) {
				String t = ary[i];
				if(t.equals("+")) {
					double a = stack.pop();
					double b = stack.pop();
					double c = b + a;
					stack.push(c);
				}else if(t.equals("-")) {
					double a = stack.pop();
					double b = stack.pop();
					double c = b - a;
					stack.push(c);
				}else if(t.equals("*")) {
					double a = stack.pop();
					double b = stack.pop();
					double c = b * a;
					stack.push(c);
				}else if(t.equals("/")){
					double a = stack.pop();
					double b = stack.pop();
					double c = b / a;
					stack.push(c);
				}else {
					double a = Integer.parseInt(t);
					stack.push(a);
				}
			}
			System.out.println(stack.pop());
		}
		sc.close();
	}
}
