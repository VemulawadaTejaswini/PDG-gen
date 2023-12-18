import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Room[] room = new Room[n];
		int[] visited = new int[n];
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			room[i] = new Room(i, 1000000000);
		}
		for(int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			room[a].list.add(b);
			room[b].list.add(a);
		}
		room[0].size = 0;
		PriorityQueue<Room> queue = new PriorityQueue<>();
		queue.add(room[0]);
		int cnt = 0;
		while(queue.size() > 0) {
			Room cur = queue.poll();
			if(visited[cur.index] == 1) continue;
			cnt += 1;
			visited[cur.index] = 1;
			ans[cur.index] = cur.brought;
			for(int x : cur.list) {
				if(visited[x] == 0) {
					if(room[cur.index].size + 1 < room[x].size) {
						room[x].size = room[cur.index].size + 1;
						room[x].brought = cur.index;
					}
					queue.add(room[x]);
				}
			}
		}
		if(cnt != n) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
			for(int i = 1; i < n; i++) {
				System.out.println(ans[i] + 1);
			}
		}
	}
}
class Room implements Comparable<Room> {
	int index;
	int brought;
	Integer size;
	List<Integer> list = new ArrayList<>();
	public Room(int index, int size) {
		this.index = index;
		this.size = size;
	}
	@Override
	public int compareTo(Room obj) {
		return this.size.compareTo(obj.size);
	}
}