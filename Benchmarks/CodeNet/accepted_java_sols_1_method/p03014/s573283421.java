
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TATE = Integer.parseInt(sc.next());
		int YOKO = Integer.parseInt(sc.next());

		String[] s = new String[TATE];
		for (int tate = 0; tate < TATE; tate++) {
			s[tate] = sc.next();
		}

		sc.close();

		int[][] res = new int[TATE][YOKO];

		for (int tate = 0; tate < TATE; tate++) {
			boolean lastTile = false; //壁はfalse
			int begin = 0;
			for (int yoko = 0; yoko < YOKO; yoko++) {
				if (s[tate].charAt(yoko) == '#') {
					if(lastTile) {
						for (int i = begin; i <= yoko - 1; i++) {
							res[tate][i] += yoko - begin;
						}
					}
					lastTile = false;
				} else {
					if (!lastTile) {
						begin = yoko;
					}
					lastTile = true;
				}
			}
			//右端
			if (lastTile) {
				for (int i = begin; i <= YOKO - 1; i++) {
					res[tate][i] += YOKO - begin;
				}
			}
		}

//		for (int tate = 0; tate < TATE; tate++) {
//			for (int yoko = 0; yoko < YOKO; yoko++) {
//				System.out.print(res[tate][yoko] + " ");
//			}
//			System.out.println("");
//		}
//		System.out.println("");

		for (int yoko = 0; yoko < YOKO; yoko++) {
			boolean lastTile = false; //壁はfalse
			int begin = 0;
			for (int tate = 0; tate < TATE; tate++) {
				if (s[tate].charAt(yoko) == '#') {
					if(lastTile) {
						for (int i = begin; i <= tate - 1; i++) {
							res[i][yoko] += tate - begin;
						}
					}
					lastTile = false;
				} else {
					if (!lastTile) {
						begin = tate;
					}
					lastTile = true;
				}
			}
			//下端
			if (lastTile) {
				for (int i = begin; i <= TATE - 1; i++) {
					res[i][yoko] += TATE - begin;
				}
			}
		}

//		for (int tate = 0; tate < TATE; tate++) {
//			for (int yoko = 0; yoko < YOKO; yoko++) {
//				System.out.print(res[tate][yoko] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("");

		int max = -1;
		for (int tate = 0; tate < TATE; tate++) {
			for (int yoko = 0; yoko < YOKO; yoko++) {
				if (res[tate][yoko] > max)
					max = res[tate][yoko];
			}
		}

		System.out.println(max - 1);
	}

}
