import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	int H;
	int[][] stones;
	int score = 0;

	public static void main(String[] args) {
		while(true) {
			int h = sc.nextInt();
			if(h == 0) break;

			Main m = new Main(h).read();
			while( m.vani() ) { m.reset(); }

			System.out.println(m.score);
		}
	}

	Main(int h) {
		H = h;
		stones = new int[H-1][5];
	}

	Main read() {
		for(int i=0; i<H-1; i++) {
			for(int j=0; j<5; j++) {
				stones[i][j] = sc.nextInt();
			}
		}
		return this;
	}

	boolean vani() {
		boolean ret = false;

		for(int i=0; i<H-1; i++) {
			int base = -1;
			int l = 0;
			for(int j=0; j<5; j++) {
				if( base == stones[i][j] ) l++;
				else {
					if(l == 3) {
						stones[i][j-1] = 0;
						stones[i][j-2] = 0;
						stones[i][j-3] = 0;
						score += base*3;
						ret = true;
					} else if (l > 3) {
						stones[i][j-1] = 0;
						score += base;
					}
					base = stones[i][j];
				}
			}
		}

		return ret;
	}

	void reset() {
		print();
	}

	void print() {
		for(int i=0; i<H-1; i++) {
			for(int j=0; j<5; j++) {
				System.out.print( stones[i][j] );
			}
			System.out.println();
		}
	}
}