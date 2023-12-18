import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Long> deque  = new ArrayDeque<Long>();
		for (int i=0;i<n;i++) {
			if (i%2==0) {
				deque.add(sc.nextLong());
			} else {
				deque.push(sc.nextLong());
			}
		}
		if (n%2==0) {
			while (deque.isEmpty()==false) {
				System.out.print(deque.pollFirst()+" ");
			}
		} else {
			while (deque.isEmpty()==false) {
				System.out.print(deque.pollLast()+" ");
			}
		}
	}
}