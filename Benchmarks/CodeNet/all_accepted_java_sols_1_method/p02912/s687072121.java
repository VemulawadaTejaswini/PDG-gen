import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		String[] numb      = scanner.nextLine().split(" ");
		Queue<Long> que = new PriorityQueue<Long>(Collections.reverseOrder());

		for(int i = 0; i < n; i++) {

			Long x = Long.parseLong(numb[i]);
			que.add(x);

		}

		for(int i = 0; i < m; i++) {

			Long min = (long)que.poll() / 2;
			que.add(min);

		}
		long ans = 0;
		for(int i = 0; i < n; i++) {

			ans += que.poll();

		}

		System.out.println(ans);

		}

}