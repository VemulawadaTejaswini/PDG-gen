import java.util.Arrays;
import java.util.Scanner;


public class Main {

	class Hanoi {
		int N;
		int forbidden;
		int[] status, highests;
		final int[] steps = new int[] {-2, -1, 1, 2};

		public Hanoi(int n) {
			N = n;
			forbidden = 9;
			status = new int[n*3];
			for (int i = 0 ; i < n ; i++) status[i] = i+1;
			highests = new int[3];
			highests[0] = n;
		}

		public Hanoi(int n, int[] test) {
			N = n;
			forbidden = 9;
			status = new int[n*3];
			for (int i = 0 ; i < n*3 ; i++) status[i] = test[i];
			highests = new int[3];
			updateHighests();
		}

		public void display() {
			for (int j = N-1 ; j >= 0 ; j--) {
				for (int i = 0 ; i < 3 ; i++) {
					System.out.print(status[i*N+j]);
				}
				System.out.print("\n");
			}
			System.out.println("---");
		}

		public int getHighestAt(int position) {
			for (int j = N-1 ; j >= 0 ; j--) {
				if (status[position*N+j] > 0)
					return status[position*N+j];
			}
			return 0;
		}

		public int getIdxOfHighestAt(int position) {
			for (int j = N-1 ; j >= 0 ; j--) {
				if (status[position*N+j] > 0)
					return position*N+j;
			}
			return position*N-1;
		}

		public void updateHighests() {
			for (int i = 0 ; i < 3 ; i++) highests[i] = getHighestAt(i);
		}

		public boolean isFinished() {
			for (int i = 0 ; i < N ; i++) {
				if (status[N+i] != i+1) return false;
			}
			return true;
		}

		public int[] makeMirror() {
			int[] mirror = Arrays.copyOf(status, status.length);
			int temp;
			for (int i = 0 ; i < N ; i++) {
				temp = mirror[i]; mirror[i] = mirror[N*2+i]; mirror[N*2+i] = temp;
			}
			return mirror;
		}

		public boolean equalsWithMirror(Hanoi target) {
			if (Arrays.equals(target.status, status)) return true;
			if (Arrays.equals(target.status, makeMirror())) return true;
			return false;
		}

		public void move(int step) {
			int ia, ib;
			switch (step) {
			case 1: //0->1
				ia = getIdxOfHighestAt(0);
				ib = getIdxOfHighestAt(1);
				status[ib+1] = status[ia]; status[ia] = 0;
				forbidden = -1;
				return;
			case -1: //0<-1
				ia = getIdxOfHighestAt(1);
				ib = getIdxOfHighestAt(0);
				status[ib+1] = status[ia]; status[ia] = 0;
				forbidden = 1;
				return;
			case 2: //1->2
				ia = getIdxOfHighestAt(1);
				ib = getIdxOfHighestAt(2);
				status[ib+1] = status[ia]; status[ia] = 0;
				forbidden = -2;
				return;
			case -2: //1<-2
				ia = getIdxOfHighestAt(2);
				ib = getIdxOfHighestAt(1);
				status[ib+1] = status[ia]; status[ia] = 0;
				forbidden = 2;
				return;
			}
		}

		public void moveNext() {
			// +1:0->1, -1:0<-1, +2:1->2, -2:1<-2
			updateHighests();
			for (int step : steps) {
				if (step == forbidden) continue;
				switch (step) {
				case -2: // 1<-2
					if (highests[1] < highests[2]) { move(-2); return; }
					break;
				case -1: // 0<-1
					if (highests[0] < highests[1]) { move(-1); return; }
					break;
				case 1: // 0->1
					if (highests[0] > highests[1]) { move(1); return; }
					break;
				case 2: // 1->2
					if (highests[1] > highests[2]) { move(2); return; }
					break;
				}
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Main m = new Main();

		boolean loop = true;
		while (loop) {
			int N = sc.nextInt(), M = sc.nextInt();
			if (N == 0 && M == 0) { loop = false; continue; } // 終了条件

			// 読み込み
			int[] array = new int[N*3];
			for (int i = 0 ; i < 3 ; i++) {
				int size = sc.nextInt();
				for (int j = 0 ; j < size ; j++) {
					array[i*N+j] = sc.nextInt();
				}
			}

			// スタートとゴールの生成
			Hanoi hanoi = m.new Hanoi(N);
			Hanoi goal = m.new Hanoi(N, array);

			// 探索
			int step = 0;
			while (true) {
				if (step > M) {
					System.out.println(-1);
					break;
				}
				if (hanoi.equalsWithMirror(goal)) {
					//hanoi.display();
					//System.out.println("---\n"+step);
					System.out.println(step);
					break;
				}
				//hanoi.display();
				hanoi.moveNext(); step++;
			}

		}




	}

}