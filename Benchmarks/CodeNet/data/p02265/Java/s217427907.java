import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws NumberFormatException,
	IOException{
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			if (str.charAt(0)=='i') {
				deque.push(Integer.parseInt(str.substring(7)));
			}
			else if (str.charAt(6)=='F') {
				deque.removeFirst();
			}
			else if (str.charAt(6)=='L') {
				deque.removeLast();
			}
			else {
				deque.remove(Integer.parseInt(str.substring(7)));
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(deque.poll());
		for (Integer s: deque) {
			sb.append(" ");
			sb.append(s);
		}
		out.println(sb);
	}
}
