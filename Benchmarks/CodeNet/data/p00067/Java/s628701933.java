import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int m[][] = new int[12][12];
		int d[][] = new int[12][12];
		for (int i=0;i<12;i++) Arrays.fill(d[i],0);
		int count = 1;

		try {
			while (true) {
				for (int i=0;i<12;i++) {
					buf = br.readLine();
					for (int j=0;j<12;j++) m[i][j] = Character.getNumericValue(buf.charAt(j));
				}
				for (int i=0;i<12;i++) {
					for (int j=0;j<12;j++) {
						int check = Existed(d,j,i);
						if (m[i][j]==1) {
							if (check==-1) {
								d[i][j] = count;
								count += 1;
							} else if (m[i][j]==1) {
								if (i>0&&j>0&&d[i-1][j]>0&&d[i][j-1]>d[i-1][j]) {
									for (int k=j-1;k>=0&&d[i][k]>d[i-1][j];k--) {
										if (d[i][k]==0) break;
										d[i][k] = d[i-1][j];
									}
									d[i][j] = d[i-1][j];
									count -= 1;
								} else  {
									d[i][j] = check;
								}
							}
						}
					}
				}
				System.out.println(count-1);
				count = 1;
				for (int i=0;i<12;i++) Arrays.fill(d[i],0);
				if (br.readLine()==null) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int Existed(int[][] m,int x,int y) {
		if (x>0&&m[y][x-1]>0) return m[y][x-1];
		else if (x<11&&m[y][x+1]>0) return m[y][x+1];
		else if (y>0&&m[y-1][x]>0) return m[y-1][x];
		else if (y<11&&m[y+1][x]>0) return m[y+1][x];
		else return -1; 
	}
}