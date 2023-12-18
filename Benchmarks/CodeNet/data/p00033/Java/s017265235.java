import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Deque<Integer> b = new ArrayDeque<Integer>();
	Deque<Integer> c = new ArrayDeque<Integer>();
	Scanner in = new Scanner(System.in);
	final int dataSet = in.nextInt();
	for (int i = 0; i < dataSet; i++) {
	 b.clear();
	 b.addLast(Integer.valueOf(0));
	 c.clear();
	 c.addLast(Integer.valueOf(0));
	 boolean isYes = true;
	 for (int ball = 0; ball < 10; ball++) {
		Integer num = in.nextInt();
		if (isYes) {
		 boolean abigb = (num.compareTo(b.peekLast()) >= 0);
		 boolean abigc = (num.compareTo(c.peekLast()) >= 0);
		 if (!abigb && !abigc) {
			isYes = false;
		 } else {
			boolean bbigc = (b.peekLast().compareTo(c.peekLast()) >= 0);
			if (abigb && bbigc) {
			 b.addLast(num);
			} else {
			 c.addLast(num);
			}
		 }
		}
	 }
	 System.out.println(isYes ? "YES" : "NO");
	}
 }
}