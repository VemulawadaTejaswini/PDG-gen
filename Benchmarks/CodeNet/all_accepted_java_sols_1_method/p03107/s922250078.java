import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Deque<Integer> deq = new ArrayDeque<Integer>();

		int count = 1;
		for (int i = 1; i < s.length; i++) {
			if(s[i]==s[i-1]) {
				count++;
			}else {
				deq.addLast(count);
				count = 1;
			}
		}
		deq.addLast(count);

		int ans = deq.pollFirst();
		while(!deq.isEmpty()) {
			ans = deq.pollFirst()-ans;
		}
		System.out.println(s.length-Math.abs(ans));
		sc.close();
	}
}