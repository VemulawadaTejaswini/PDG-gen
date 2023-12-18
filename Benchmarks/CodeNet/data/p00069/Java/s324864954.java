import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int m = Integer.parseInt(br.readLine());
				int atari = Integer.parseInt(br.readLine());
				int d = Integer.parseInt(br.readLine());
				int f[][] = new int[d][n-1];
				for (int i=0;i<d;i++) {
					buf = br.readLine();
					for (int j=0;j<n-1;j++) {
						f[i][j] = Character.getNumericValue(buf.charAt(j));
					}
				}
				if (atari==goal1(f,d,n-1,m)) System.out.println(0);
				else {
					//print_f(f,d,n-1);
					boolean clear = false;
					for (int i=0;i<d;i++) {
						for (int j=0;j<n-1;j++) {
							if (f[i][j]==2) {
								f[i][j] = 1;
								if (atari==goal2(f,d,n-1,m)) {
									System.out.println((i+1)+" "+(j+1));
									clear = true;
								}
								f[i][j] = 2;
							}
						}
						if (clear) break;
					}
					if (!clear) System.out.println(1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int goal1(int[][] f,int x,int y,int s) {
		int p = s;
		for (int i=0;i<x;i++) {
			if (p==1) {
				if (f[i][0]==1) p++;
				else if (y==1) {
					f[i][0] = 2;
				} else if (f[i][1]==0) {
					f[i][0] = 2;
				}
			} else if (p==y+1) {
				if (f[i][y-1]==1) p--;
				else if (y==1) {
					f[i][y-1] = 2;
				} else if (f[i][y-2]==0) {
					f[i][y-1] = 2;
				}
			} else if (f[i][p-2]==1) {
				p--;
			} else if (f[i][p-1]==1) {
				p++;
			} else {
				if (p==2) f[i][p-2] = 2;
				else if (f[i][p-3]==0) f[i][p-2] = 2;

				if (p==y) f[i][p-1] = 2;
				else if (f[i][p]==0) f[i][p-1] = 2;
			}
		}
		return p;
	}

	public static int goal2(int[][] f,int x,int y,int s) {
		int p = s;
		for (int i=0;i<x;i++) {
			if (p==1) {
				if (f[i][0]==1) p++;
			} else if (p==y+1) {
				if (f[i][y-1]==1) p--;
			} else if (f[i][p-2]==1) {
				p--;
			} else if (f[i][p-1]==1) {
				p++;
			}
		}
		return p;
	}

	public static void print_f(int[][] f,int x,int y) {
		for (int i=0;i<x;i++) {
			for (int j=0;j<y;j++) System.out.print(f[i][j]);
			System.out.println();
		}
	}
}