import java.util.*;

class Main {
	static int SIZE = 3;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		Puzzle p = new Puzzle();

		for (int i = 0; i < SIZE*SIZE; i++) {
			p.board[i] = scanner.nextInt();
			if(p.board[i] == 0)
				p.space = i;
		}

		int steps = solve(p);
		System.out.println(steps);
	}

    int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	private int solve(Puzzle p) {
		Puzzle u = new Puzzle();
		Puzzle v = new Puzzle();

		Deque<Puzzle> queue = new ArrayDeque<>();
		queue.offer(p);

		Set<Puzzle> set = new HashSet<Main.Puzzle>();
		set.add(p);

		while(!queue.isEmpty()) {
			u = queue.poll();
			
			if(isSolution(u)) 
				return u.countStep;

			int y = u.space/SIZE;
			int x = u.space%SIZE;

			for(int[] d : dxy) {
				int dy = y + d[0];
				int dx = x + d[1];

				if(dy < 0 || dx < 0 || SIZE <= dy || SIZE <= dx) 
					continue;

				v = u.clone();
				move(v, u.space, dy*SIZE+dx);
				v.space = dy*SIZE+dx;

				if(!set.contains(v)) {
					set.add(v);
					v.countStep++;
					queue.offer(v);
				}
			}
		}

		return -1;
	}

	private boolean isSolution(Puzzle p) {
		for (int i = 0; i < SIZE*SIZE-1; i++) {
			if(p.board[i] != i+1)
				return false;
		}

		return true;
	}

	private void move(Puzzle p, int space, int i) {
		int tmp = p.board[i];
		p.board[i] = p.board[space];
		p.board[space] = tmp;
	}


	class Puzzle implements Cloneable {
		int[] board = new int[SIZE*SIZE];
		int space;
		int countStep = 0;

		@Override
		public Puzzle clone(){
			try {
				Puzzle newPuzzle = (Puzzle)super.clone();
				newPuzzle.board = Arrays.copyOf(board, SIZE*SIZE);
				return newPuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime*result + getOuterType().hashCode();
			result = prime*result + Arrays.hashCode(board);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;

			if(obj == null)
				return false;

			if(getClass() != obj.getClass())
				return false;

			Puzzle p = (Puzzle)obj;
			
			if(!getOuterType().equals(p.getOuterType()))
				return false;

			if(!Arrays.equals(board, p.board))
				return false;

			return true;
		}

		private Main getOuterType() {
			return Main.this;
		}
	}
}
