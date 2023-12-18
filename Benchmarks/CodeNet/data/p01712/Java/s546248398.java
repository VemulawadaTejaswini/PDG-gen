import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int N = s();
		int W = s()+1;
		int H = s()+1;

		BitSet[] map = new BitSet[W];
		for(int i = 0; i < W; i++) {
			map[i] = new BitSet(H);
		}

		for(int i = 0; i < N; i++) {
			int x = s();
			int y = s();
			int w = s();
			for(int u = 0; u < W; u++) {
				for(int l = 0; l <= w; l++) {
					if((y + l < H)) {
						map[u].set(y+l);
					}
					if((y - l >= 0)) {
						map[u].set(y-l);
					}
				}
			}

			for(int u = 0; u < H; u++) {
				for(int l = 0; l <= w; l++) {
					if((x + l < W)) {
						map[x+l].set(u);
					}
					if((x - l >= 0)) {
						map[x-l].set(u);
					}
				}
			}
		}

		boolean s = true;
		for(BitSet list : map) {
			for(int i = 0; i < H ; i++) {
				if(list.get(i)) System.out.print("*");
				else System.out.print("-");
				s  = s & list.get(i);
			}
			System.out.println();
		}
		if(s) System.out.println("Yes");
		else System.out.println("No");
	}

	public static int s() {
		return Integer.parseInt(scan.next());
	}
}