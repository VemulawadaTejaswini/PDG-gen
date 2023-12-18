import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		new A1141().ans(sc);
	}

}

class Code {

}

class A1130 {

	int[] xdis = { -1, 0, +1, 0 };
	int[] ydis = { 0, -1, 0, +1 };

	int[][] cm;

	public void ans(Scanner sc) {
		while (true) {
			String str = sc.nextLine();
			String[] cut = str.split(" ");
			int W = Integer.parseInt(cut[0], 10);
			int H = Integer.parseInt(cut[1], 10);

			if (W == 0) {
				break;
			}

			cm = new int[H][W];

			int x = 0;
			int y = 0;
			for (int h = 0; h < H; h++) {
				String map = sc.nextLine();
				for (int w = 0; w < W; w++) {
					char c = map.charAt(w);
					switch (c) {
					case '.':
						cm[h][w] = 0;
						break;
					case '@':
						x = w;
						y = h;
						cm[h][w] = 0;
						break;
					case '#':
						cm[h][w] = -1;
						break;
					}
				}
			}
			rec(x, y);

			int count = 0;
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if (cm[h][w] == 1) {
						count++;
					}
				}
			}
			System.out.println(count);

		}
	}

	void rec(int x, int y) {
		if (y < 0 || cm.length <= y) {
			return;
		}
		if (x < 0 || cm[0].length <= x) {
			return;
		}
		if (cm[y][x] != 0) {
			return;
		}

		cm[y][x] = 1;
		for (int i = 0; i < xdis.length; i++) {
			rec(x + xdis[i], y + ydis[i]);
		}
	}
}

class A1141 {
	boolean[] ss;

	public void ans(Scanner sc) {
		ss = new boolean[1000000];
		for (int i = 0; i < ss.length; i++) {
			ss[i]=true;
		}
		ss[0] = false;
		ss[1] = false;

		for (int i = 4; i < ss.length; i += 2) {
			ss[i] = false;
		}

		for (int i = 3; i < ss.length / 2; i += 2) {
			if (ss[i]) {
				for (int j = 2; i * j < ss.length; j++) {
					ss[i * j] = false;
				}
			}
		}

		while (true) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();

			if(a==0){
				break;
			}

			int c = 0;
			int i;
			for(i=0;;i++){
//				System.out.println(a+i*d);
				if(ss[a+i*d]){
					c++;
				}
				if(c==n){
					System.out.println(a+i*d);
					break;
				}
			}
		}
	}

}