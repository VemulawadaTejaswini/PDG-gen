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
			int min = n;
			ArrayList<Data> al = new ArrayList<Data>();
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
			al.addAll(queue);
			queue.clear();
			for(int i = 0; i < al.size(); i++) {
				if(i != al.size()-1 && 1 + al.get(i+1).count >= 4) {
					al.get(i+1).count++;
					al.get(i).count--;
					queue.addAll(al);
					//
					ArrayDeque<Data> queue2 = new ArrayDeque<Data>();
					while (!queue.isEmpty()) {
						if(queue.peekLast().count == 0) {
							queue.pollLast();
							continue;
						}
						if (queue2.isEmpty()) {
							if (queue.peekLast().count >= 4) {
								queue.pollLast();
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
					//
					queue.clear();
					al.get(i).count++;
					al.get(i+1).count--;
				}
				if(i != 0 && 1 + al.get(i-1).count >= 4) {
					al.get(i-1).count++;
					al.get(i).count--;
					queue.addAll(al);
					//
					ArrayDeque<Data> queue2 = new ArrayDeque<Data>();
					while (!queue.isEmpty()) {
						if(queue.peekLast().count == 0) {
							queue.pollLast();
							continue;
						}
						if (queue2.isEmpty()) {
							if (queue.peekLast().count >= 4) {
								queue.pollLast();
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
					//
					queue.clear();
					al.get(i).count++;
					al.get(i-1).count--;
				}
				else if(i != 0 && i != al.size()-1 && al.get(i).count == 1 && al.get(i-1).color == al.get(i+1).color && al.get(i-1).count + al.get(i+1).count + 1 >= 4) {
					int pre = al.get(i).color;
					al.get(i).color = al.get(i-1).color;
					queue.addAll(al);
					//
					ArrayDeque<Data> queue2 = new ArrayDeque<Data>();
					while (!queue.isEmpty()) {
						if(queue.peekLast().count == 0) {
							queue.pollLast();
							continue;
						}
						if (queue2.isEmpty()) {
							if (queue.peekLast().count >= 4) {
								queue.pollLast();
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
					//
					queue.clear();
					al.get(i).color = pre;
				}
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