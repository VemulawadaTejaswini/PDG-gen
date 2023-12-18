import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Data {
	int n[][] = new int[2][1000];
	int c[][] = new int[2][1000];

	Data(int n1[],int n2[]) {
		for (int i=0;i<1000;i++) {
			this.n[0][i] = n1[i];
			this.n[1][i] = n2[i];
		}
		Arrays.fill(c[0],0);
		Arrays.fill(c[1],0);
	}

	void count() {
		for (int i=0;i<1000;i++) {
			if (this.n[0][i]!=-1) c[0][this.n[0][i]]++;
			if (this.n[1][i]!=-1) c[1][this.n[1][i]]++;
		}
	}

	void search() {
		for (int i=0;i<1000;i++) {
			if (c[0][i]>0&&c[1][i]>0) System.out.println(i+" "+(c[0][i]+c[1][i]));
		}
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int n[][] = new int[2][1000];
			int c = 0;
			int t;
			Arrays.fill(n[0],-1);
			Arrays.fill(n[1],-1);
			while (!(buf = br.readLine()).equals("")) {
				StringTokenizer st = new StringTokenizer(buf,",");
				n[0][c++] = Integer.parseInt(st.nextToken());
				t = Integer.parseInt(st.nextToken());
			}
			c = 0;
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf,",");
				n[1][c++] = Integer.parseInt(st.nextToken());
				t = Integer.parseInt(st.nextToken());
			}
			Data d = new Data(n[0],n[1]);
			d.count();
			d.search();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}