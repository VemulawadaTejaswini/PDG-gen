import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		ArrayList <Deque<Integer>> deques = new ArrayList <Deque<Integer>>();  //DequeのArrayListを生成
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				deques.add(new ArrayDeque<Integer>());  //n個のdequeを追加
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int request = sc.nextInt();  //命令 0 push 1 top 2 pop
				int deq = sc.nextInt();  //何個目のdeque
				switch (request) {
				//push(deq,x)
				case 0:
					int x = sc.nextInt();
					deques.get(deq).addFirst(x);
					break;
				//top(deq)
				case 1:
					if (deques.get(deq).size() != 0) { //空じゃなかったら
						System.out.println(deques.get(deq).peek());
					}
					break;
				//pop(deq)
				case 2:
					if (deques.get(deq).size() != 0) { //空じゃなかったら
						deques.get(deq).pop();
					}
					break;

				}
			}
		}
	}
}

