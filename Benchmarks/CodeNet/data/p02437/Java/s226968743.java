import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		ArrayList <PriorityQueue<Integer>> queues = new ArrayList <PriorityQueue<Integer>>();  //PriorityQueueのArrayListを生成
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				queues.add(new PriorityQueue<Integer>(Collections.reverseOrder()));

			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();
				int que = sc.nextInt();
				switch (query) {
				//insert(t,x)
				case 0:
					int x = sc.nextInt();
					queues.get(que).add(x);
					break;
				case 1:
					if (queues.get(que).size() != 0) {
						System.out.println(queues.get(que).peek());
					}
					break;
				case 2:
					if (queues.get(que).size() != 0) {
						queues.get(que).poll();
					}
					break;

				}
			}
		}
	}
}

