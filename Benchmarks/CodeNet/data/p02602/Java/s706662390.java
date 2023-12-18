import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		Queue<Long> que = new ArrayDeque();
		Long lastScore = 0L;
		for(int i=0; i<N; i++) {
			long a = Long.parseLong(sc.next());
			que.add(a);
			if(que.size()>K) {
				if(que.peek() < a) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				que.poll();
			}
		}
	}
}

