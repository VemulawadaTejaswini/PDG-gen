import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		ArrayDeque<Character> deq = new ArrayDeque<>();
		int count = 0;
		for (char c : arr) {
		    if (deq.size() == 0 || c == deq.peek()) {
		        deq.push(c);
		    } else {
		        deq.pop();
		        count++;
		    }
		}
		System.out.println(count * 2);
   }
}
