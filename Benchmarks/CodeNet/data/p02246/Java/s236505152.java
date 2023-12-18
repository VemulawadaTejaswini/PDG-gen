import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static final int PUZZLE_SIZE = 16;
	static final int PUZZLE_WIDTH = 4;
	static long[] fac = new long[PUZZLE_SIZE];
	static long GOAL_HASH;

	static HashMap<Long, State> hmap = new HashMap<>();
	static PriorityQueue<State> que = new PriorityQueue<>((a, b) -> (a.m+a.h) - (b.m+b.h));	//A*algorithm

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		for(int i=0; i<PUZZLE_SIZE; i++) {
			A.add((i+1)%PUZZLE_SIZE);
		}
		GOAL_HASH = getHash(A);

		A.clear();
		for(int i=0; i<PUZZLE_SIZE; i++) {
			A.add(sc.nextInt());
		}

		State init = new State(A, 0);
		hmap.put(init.hash, init);
		que.add(init);

		while(true) {
			que.poll().heuristicSearch();
		}
	}

	static class State {
		ArrayList<Integer> A;
		long hash;
		int m;	//???????????§???????°??????°
		int h;	//?????\??????????????£????????¢??°

		State(ArrayList<Integer> A, int m) {
			this.A = A;
			this.m = m;
			this.hash = getHash(A);
			this.h = calcHeuristic();

			//???????????¶
			if(hash == GOAL_HASH) {
				System.out.println(m);
				System.exit(0);
			}
		}

		public void heuristicSearch() {
			ArrayList<Integer> Ac = new ArrayList<>(A);
//			System.out.println(hash + " " + m + " " + h);
//			System.out.println(Ac);

			//up
			if(Ac.indexOf(0) >= PUZZLE_WIDTH) {
//				System.out.println("up");
				int idx_1 = Ac.indexOf(0);
				int idx_2 = Ac.indexOf(0) - PUZZLE_WIDTH;
				Ac.set(idx_1, Ac.get(idx_2));
				Ac.set(idx_2, 0);
				long hash = getHash(Ac);
				if(hmap.containsKey(hash)) {
					State state = hmap.get(hash);
					if(this.m + 1 < state.m) {
						if(que.contains(state)) {
							que.remove(state);
						}
						state.m = this.m + 1;
						que.add(state);
					}
				} else {
					State state = new State(Ac, m+1);
					hmap.put(state.hash, state);
					que.add(state);
				}
			}

			//down
			Ac = new ArrayList<>(A);
			if(Ac.indexOf(0) < PUZZLE_SIZE - PUZZLE_WIDTH) {
//				System.out.println("down");
				int idx_1 = Ac.indexOf(0);
				int idx_2 = Ac.indexOf(0) + PUZZLE_WIDTH;
				Ac.set(idx_1, Ac.get(idx_2));
				Ac.set(idx_2, 0);
				long hash = getHash(Ac);
				if(hmap.containsKey(hash)) {
					State state = hmap.get(hash);
					if(this.m + 1 < state.m) {
						if(que.contains(state)) {
							que.remove(state);
						}
						state.m = this.m + 1;
						que.add(state);
					}
				} else {
					State state = new State(Ac, m+1);
					hmap.put(state.hash, state);
					que.add(state);
				}
			}

			//left
			Ac = new ArrayList<>(A);
			if(Ac.indexOf(0) % PUZZLE_WIDTH != 0) {
//				System.out.println("left");
				int idx_1 = Ac.indexOf(0);
				int idx_2 = Ac.indexOf(0) - 1;
				Ac.set(idx_1, Ac.get(idx_2));
				Ac.set(idx_2, 0);
				long hash = getHash(Ac);
				if(hmap.containsKey(hash)) {
					State state = hmap.get(hash);
					if(this.m + 1 < state.m) {
						if(que.contains(state)) {
							que.remove(state);
						}
						state.m = this.m + 1;
						que.add(state);
					}
				} else {
					State state = new State(Ac, m+1);
					hmap.put(state.hash, state);
					que.add(state);
				}
			}

			//right
			Ac = new ArrayList<>(A);
			if(Ac.indexOf(0) % PUZZLE_WIDTH != PUZZLE_WIDTH - 1) {
//				System.out.println("right");
				int idx_1 = Ac.indexOf(0);
				int idx_2 = Ac.indexOf(0) + 1;
				Ac.set(idx_1, Ac.get(idx_2));
				Ac.set(idx_2, 0);
				long hash = getHash(Ac);
				if(hmap.containsKey(hash)) {
					State state = hmap.get(hash);
					if(this.m + 1 < state.m) {
						if(que.contains(state)) {
							que.remove(state);
						}
						state.m = this.m + 1;
						que.add(state);
					}
				} else {
					State state = new State(Ac, m+1);
					hmap.put(state.hash, state);
					que.add(state);
				}
			}
		}

		private int calcHeuristic() {
			int heuristic = 0;
			for(int i=0; i<PUZZLE_SIZE; i++) {
				int idx_1 = A.indexOf(i);
				int idx_2 = (i-1+PUZZLE_SIZE)%PUZZLE_SIZE;
				int d_1 = Math.abs((idx_1 % PUZZLE_WIDTH - idx_2 % PUZZLE_WIDTH));
				int d_2 = Math.abs((idx_1 / PUZZLE_WIDTH - idx_2 / PUZZLE_WIDTH));
				heuristic +=  d_1 + d_2;	//ex d=8 -> heu=2+2
			}
			return heuristic;
		}
	}

	public static long getHash(ArrayList<Integer> A) {
		long hash = 0;
		ArrayList<Integer> set = new ArrayList<>();
		for(int i=0; i<PUZZLE_SIZE; i++) {
			set.add(i);
		}
		for(int i=PUZZLE_SIZE-1; i>=1; i--) {
			hash += set.indexOf(A.get(i)) * factorial(i);
			set.remove(set.indexOf(A.get(i)));
		}
		return hash;
	}

	private static long factorial(int k) {
		if(k == 1) {
			return 1;
		} else if(fac[k] != 0) {
			return fac[k];
		} else {
			return k * factorial(k-1);
		}
	}
}