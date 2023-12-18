import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Seven Puzzle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Map<Integer, Integer> move = new HashMap<>();
		Deque<State> que = new ArrayDeque<>();
		State s = new State(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 0, 0);

		que.offer(s);
		move.put(s.id, 0);

		while (!que.isEmpty()) {
			State p = que.poll();
			while (p.hasNext()) {
				State n = p.next();
				if (!move.containsKey(n.id)) {
					que.offer(n);
					move.put(n.id, n.move);
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(move.get(s2i(line)));
		}
	}

	static int s2i(String s) {
		int ret = 0;
		for (int i = 0; i < s.length(); i += 2) {
			ret *= 10;
			ret += s.charAt(i) - '0';
		}
		return ret;
	}
}

class State {

	static int SIZE = 8;
	static final int[][] SWAP = {
			{1, 4},     //0
			{0, 2, 5},  //1
			{1, 3, 6},  //2
			{2, 7},     //3
			{0, 5},     //4
			{1, 4, 6},  //5
			{2, 5, 7},  //6
			{3, 6},     //7
	};

	int id;
	int[] pz;
	int zero;
	int move;
	int idx = 0;

	State(int[] pz, int zero, int move) {
		this.pz = pz;
		this.zero = zero;
		this.move = move;
		id = 0;
		for (int i = 0; i < SIZE; i++) {
			id *= 10;
			id += pz[i];
		}
	}

	State next() {
		int[] _pz = new int[SIZE];
		System.arraycopy(pz, 0, _pz, 0, SIZE);
		_pz[zero] = pz[SWAP[zero][idx]];
		_pz[SWAP[zero][idx]] = 0;
		this.idx++;
		return new State(_pz, SWAP[zero][idx - 1], move + 1);
	}

	boolean hasNext() {
		return idx < SWAP[zero].length;
	}
}