import java.util.*;

public class Main{
	static int h;
	static int w;
	static Masu[][] masu;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String rts=sc.nextLine();
			String[] rtssp=rts.split("\\s+");
			w=Integer.parseInt(rtssp[0]);
			h=Integer.parseInt(rtssp[1]);
			if(w==0&&h==0)break;
			
		

			masu = new Masu[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					masu[i][j] = new Masu(i, j);
			}

			for (int i = 0; i < h; i++) {
				String str = sc.nextLine();
				String[] strsp = str.split("\\s+");	
				for (int j = 0; j < w - 1; j++) {		
					if (strsp[j + 1].equals("0")) {

						masu[i][j].r = 1;
						masu[i][j + 1].l = 1;
					}
				}
				if (i != h - 1) {
					String str2 = sc.nextLine();
					String[] strsp2 = str2.split("\\s+");

					for (int j = 0; j < w; j++) {
						if (strsp2[j].equals("0")) {

							masu[i][j].u = 1;
							if (i + 1 != h) masu[i + 1][j].t = 1;
						}
					}
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					masu[i][j].setexpect(h - 1, w - 1);
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					masu[i][j].setqueue(masu);
				}
			}

			int herei = 0;
			int herej = 0;
			count = 1;
			
			masu[herei][herej].pass=true;
			
			if (rec(herei, herej) != 0) System.out.println("0");
			
	/*		for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(masu[i][j].pass)System.out.print("1");
					else System.out.print("0");
				}
				System.out.println();
			}
		*/	
			
		}
	}

	public static int rec(int herei, int herej) {
		if (herei == h - 1 && herej == w - 1) {
			System.out.println(count);
			return 0;
		}
		while (true) {
			Masu sub = masu[herei][herej].getshort();
			if (sub == null) return -1;
			if (sub.pass == true) continue;

			int x = sub.tate;
			int y = sub.yoko;
			masu[x][y].pass = true;
			count++;
			if (rec(x, y) == 0) return 0;
			else {
				masu[x][y].pass = false;
				count--;
			}
		}

	}

}

class Masu implements Comparable<Masu> {
	int t;
	int r;
	int l;
	int u;
	int tate;
	int yoko;
	int expect = 0;
	boolean pass;

	PriorityQueue<Masu> queue = new PriorityQueue<Masu>();

	public Masu(int tt, int yy) {
		t = -1;
		r = -1;
		l = -1;
		u = -1;

		tate = tt;
		yoko = yy;
		pass = false;
	}

	public void setexpect(int h, int w) {
		int subh = h - tate;
		int subw = w - yoko;
		expect = subh + subw;
	}

	public void setqueue(Masu[][] map) {
		if (this.t == 1) queue.add(map[tate - 1][yoko]);
		if (this.r == 1) queue.add(map[tate][yoko + 1]);
		if (this.l == 1) queue.add(map[tate][yoko - 1]);
		if (this.u == 1) queue.add(map[tate + 1][yoko]);
	}

	public Masu getshort() {
		return queue.poll();
	}

	public int compareTo(Masu other) {
		return this.expect - other.expect;
	}

}