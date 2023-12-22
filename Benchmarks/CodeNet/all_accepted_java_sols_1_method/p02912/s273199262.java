import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Long> p_que = new PriorityQueue<Long>(Comparator.reverseOrder()); //最大のものを取り出し
		for(int i = 0 ; i < n ; i++) {
			p_que.add(sc.nextLong());
		}
		for(int i = 0 ; i < m ; i++) {
			p_que.add(p_que.poll() / 2);
		}
		long sum = 0;
		while(!p_que.isEmpty()) {
			sum += p_que.poll();
		}
		System.out.println(sum);

	}
}

