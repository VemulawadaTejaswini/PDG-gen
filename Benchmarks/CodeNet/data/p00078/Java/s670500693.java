import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int x = n/2;
				int y = n/2+1;
				int magic[][] = new int[n][n];
				for (int i=0;i<n;i++) Arrays.fill(magic[i],0);
				for (int i=1;i<=Math.pow(n,2);i++) {
					if (magic[y][x]==0) {
						magic[y][x] = i;
					}
					else {
						while (magic[y][x]>0) {
							x = ((x+n)-1)%n;
							y = (y+1)%n;
						}
						magic[y][x] = i;
					}
					x = (x+1)%n;
					y = (y+1)%n;
				}
				for (int i=0;i<n;i++) {
					for (int j=0;j<n;j++) System.out.printf("%4d",magic[i][j]);
					System.out.println("");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}