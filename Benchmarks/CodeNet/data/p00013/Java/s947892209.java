import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<Integer>();
		while(sc.hasNext()) {
			int t = sc.nextInt();
			if(t != 0) {
				q.addFirst(t);
			}else {
				System.out.println(q.pollFirst());
			}
		}
		sc.close();
	}
}
