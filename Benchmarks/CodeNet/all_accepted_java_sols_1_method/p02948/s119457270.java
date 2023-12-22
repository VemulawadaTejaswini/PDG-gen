import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		Long m = sc.nextLong();
		Map<Long, List<Long>> map = new HashMap<>();
		while (sc.hasNextLong()) {
			Long a = sc.nextLong(); // a日後
			Long b = sc.nextLong(); // 報酬
			Long key = m - a;
			if (key < 0) {
				continue;
			}
			List<Long> list = map.getOrDefault(key, new ArrayList<Long>());
			list.add(b);
			map.put(key, list);
		}

		// 日数ごとにバイトの報酬順でのソート

		long sum = 0;
		Queue<Long> queue = new PriorityQueue<Long>(Collections.reverseOrder());
		for (long i = m - 1; i >= 0; i--) {
			try {
				queue.addAll(map.get(i));
			} catch (Exception e) {}
			if(queue.isEmpty()) {
				continue;
			}
			sum = sum + queue.poll();
		}
		sc.close();
		System.out.println(sum);
	}
}
