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
		int[] roads;
	}

	private void addRoad(Room r, int i) {
		if (r.roads == null) {
			r.roads = new int[] { i };
		}
		else {
			int[] a = new int[r.roads.length + 1];
			System.arraycopy(r.roads, 0, a, 0, r.roads.length);
			a[a.length - 1] = i;
			r.roads = a;
		}
	}

	Room[] rooms;

	List<Integer> links = new ArrayList<Integer>();

	private void linkRooms() {
		links.add(0);
		while (!links.isEmpty()) {
			int i = links.remove(0);
			Room r = rooms[i];
			if (r.roads != null) {
				for (int j : r.roads) {
					Room c = rooms[j];
					if (c.next < 0) {
						c.next = i;
						links.add(j);
					}
				}
			}
		}
	}

	public void execute(InputStream in) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

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
