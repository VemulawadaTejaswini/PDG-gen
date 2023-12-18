import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		ArrayList <Queue<Integer>> queues = new ArrayList <Queue<Integer>>();  //QueueのArrayListを生成
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				queues.add(new ArrayDeque<Integer>());  //n個のqueueを追加
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int request = sc.nextInt();  //命令 0 enqueue 1 front 2 dequeue
				int que = sc.nextInt();  //何個目のqueue
				switch (request) {
				//enqueue(que,x)
				case 0:
					int x = sc.nextInt();
					queues.get(que).add(x);
					break;
				//front(que)
				case 1:
					if (queues.get(que).size() != 0) { //空じゃなかったら
						System.out.println(queues.get(que).peek());
					}
					break;
				//dequeue(que)
				case 2:
					if (queues.get(que).size() != 0) { //空じゃなかったら
						queues.get(que).poll();
					}
					break;

				}
			}
		}
	}
}

