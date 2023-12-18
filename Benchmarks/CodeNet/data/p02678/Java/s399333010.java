import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute(System.in);
	}

	private static class Room {
		int next = -1;
		List<Integer> roads;
	}

	private void addRoad(Room r, int i) {
		if (r.roads == null) {
			r.roads = new ArrayList<Integer>();
		}
		r.roads.add(i);
	}

	Room[] rooms;

	int links[];

	private void linkRooms() {
		int len = rooms.length;
		int idx = 0;
		links[0] = 0;
		int cnt = 1;
		while (idx < len) {
			int i = links[idx++];
			Room r = rooms[i];
			if (r.roads != null) {
				for (int k : r.roads) {
					Room c = rooms[k];
					if (c.next < 0) {
						c.next = i;
						links[cnt++] = k;
					}
				}
			}
		}
	}

	public void execute(InputStream in) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		links = new int[n];
		rooms = new Room[n];
		for (int i = 0; i < n; i++) {
			rooms[i] = new Room();
		}
		
		int a, b;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			
			addRoad(rooms[a], b);
			addRoad(rooms[b], a);
		}
		sc.close();
		
		rooms[0].next = 0;
		linkRooms();

		for (Room r : rooms) {
			if (r.next < 0) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		for (int i = 1; i < rooms.length; i++) {
			Room r = rooms[i];
			System.out.println(r.next + 1);
		}
	}
}
