import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if(i != 0 && i != n-1) {
					if(list[i-1] == list[i] && list[i] == list[i+1]) continue;
				}
				int pre = list[i];
				for (int j = 1; j <= 3; j++) {
					if (pre == j) continue;
					list[i] = j;
					ArrayDeque<Data> queue = new ArrayDeque<Data>();
					for (int k = 0; k < n; k++) {
						int color = list[k];
						if (k == 0)
							queue.addFirst(new Data(color, 1));
						else {
							if (queue.peekFirst().color == color) {
								Data tmp = queue.pollFirst();
								tmp.count++;
								queue.addFirst(tmp);
							} else {
								queue.addFirst(new Data(color, 1));
							}
						}
					}
					ArrayDeque<Data> queue2 = new ArrayDeque<Data>();
					boolean check = false;
					while (!queue.isEmpty()) {
						if (queue2.isEmpty()) {
							if (queue.peekLast().count >= 4) {
								queue.pollLast();
								check = true;
							} 
							else {
								queue2.addFirst(queue.pollLast());
							}
						} 
						else {
							if (queue.peekLast().color == queue2.peekFirst().color) {
								Data tmp = queue2.pollFirst();
								tmp.count += queue.pollLast().count;
								queue2.addFirst(tmp);
							} 
							else if (queue2.peekFirst().count >= 4) {
								check = true;
								queue2.pollFirst();
							}
							else {
								queue2.addFirst(queue.pollLast());
							}
						}
					}
					int sum = 0;
					while (!queue2.isEmpty()) {
						sum += queue2.pollLast().count;
					}
					min = Math.min(min, sum);
				}
				list[i] = pre;
			}
			System.out.println(min);
		}

	}




	static class Data {
		int color;
		int count;
		Data(int a, int b) {
			color = a;
			count = b;
		}
	}



}