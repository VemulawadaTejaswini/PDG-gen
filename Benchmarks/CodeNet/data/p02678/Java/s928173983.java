import java.io.*;
import java.util.*;
import java.util.function.*;

class Room {
	int number, cost;

	Room(int number, int cost) {
		this.number = number;
		this.cost = cost;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		var rooms = new BitSet[N];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get())-1;
			int B = Integer.parseInt(sc.get())-1;
			var roomA = rooms[A];
			if (roomA == null) roomA = rooms[A] = new BitSet(N);
			var roomB = rooms[B];
			if (roomB == null) roomB = rooms[B] = new BitSet(N);

			roomA.set(B);
			roomB.set(A);
		}

		int[] result = new int[N];
		Arrays.fill(result, -1);
		var deque = new PriorityQueue<Room>(Comparator.comparingInt(r -> r.cost));
		deque.add(new Room(0, 0));
		while (!deque.isEmpty()) {
			Room room = deque.remove();
			int index = room.number;
			int cost = room.cost;
			var iterator = rooms[index].stream().iterator();
			while (iterator.hasNext()) {
				int next = iterator.next();
				if (result[next] == -1) {
					result[next] = index;
					var nextRoom = new Room(next, cost + 1);
					deque.add(nextRoom);
				}
			}
		}
		System.out.println("Yes");
		for (int i = 1; i < result.length; i++) {
			System.out.println(result[i] + 1);
		}
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}