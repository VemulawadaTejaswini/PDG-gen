import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> dc = new ArrayDeque<Integer>();
        
		while(scan.hasNext()) {
			String s = scan.next();
			if("+".equals(s)) {
				int x = dc.pop();
				int y = dc.pop();
				dc.push(x+y);
			}
			else if("-".equals(s)) {
				int x = dc.pop();
				int y = dc.pop();
				dc.push(y-x);
			}
			else if("*".equals(s)) {
				int x = dc.pop();
				int y = dc.pop();
				dc.push(x*y);
			}
			else {
				dc.push(Integer.valueOf(s));
			}
		}
		System.out.println(dc.pop());
		scan.close();
	}
}
