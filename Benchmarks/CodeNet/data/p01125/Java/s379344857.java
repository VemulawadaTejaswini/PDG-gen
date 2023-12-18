import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Robot {
	int x,y;
	Robot(int x,int y,int[][] field) {
		this.x = x;
		this.y = y;
		field[x][y] = 0;
	}
	void move(int dir,int size,int[][] field) {
		if (dir==0) {
			for (int i=0;i<size;i++) {
				if (field[this.x][--this.y]==1) field[this.x][this.y] = 0;
			}
		} else if (dir==1) {
			for (int i=0;i<size;i++) {
				if (field[this.x][++this.y]==1) field[this.x][this.y] = 0;
			}
		} else if (dir==2) {
			for (int i=0;i<size;i++) {
				if (field[--this.x][this.y]==1) field[this.x][this.y] = 0;
			}
		} else if (dir==3) {
			for (int i=0;i<size;i++) {
				if (field[++this.x][this.y]==1) field[this.x][this.y] = 0;
			}
		}
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int M = Integer.parseInt(buf);
				int field[][] = new int[21][21];
				for (int i=0;i<20;i++) {
					Arrays.fill(field[i],0);
				}
				StringTokenizer st;
				for (int i=0;i<M;i++) {
					st = new StringTokenizer(br.readLine());
					field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
				}
				int N = Integer.parseInt(br.readLine());
				Robot r = new Robot(10,10,field);
				int dir = 4;
				for (int i=0;i<N;i++) {
					st = new StringTokenizer(br.readLine());
					buf = st.nextToken();
					if (buf.equals("S")) dir = 0;
					else if (buf.equals("N")) dir = 1;
					else if (buf.equals("W")) dir = 2;
					else if (buf.equals("E")) dir = 3;
					r.move(dir,Integer.parseInt(st.nextToken()),field);
				}
				//printField(field);
				if (check(field)) System.out.println("Yes");
				else System.out.println("No");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean check(int[][] f) {
		for (int i=0;i<20;i++) {
			for (int j=0;j<20;j++) {
				if (f[i][j]==1) return false;
			}
		}
		return true;
	}

	public static void printField(int[][] f) {
		for (int i=0;i<20;i++) {
			for (int j=0;j<20;j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
}