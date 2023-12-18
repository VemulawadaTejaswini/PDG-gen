import java.io.*;
import java.util.StringTokenizer;

class Line {
	int h,p,q;
	Line(int h,int p,int q) {
		this.h = h;
		this.p = p;
		this.q = q;
	}
	void printLine() {
		System.out.println(this.h+" "+this.p+" "+this.q);
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int temp = 1001;
				int r = a;

				Line lines[] = new Line[m];
				for (int i=0;i<m;i++) {
					st = new StringTokenizer(br.readLine());
					lines[i] = new Line(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
				}
				HeightSort(lines,m);
				for (int i=0;i<m;i++) {
					if (temp==lines[i].h&&a!=r) {
						a = r;
						continue;
					}
					a = r;
					if (a==lines[i].p) r = lines[i].q;
					else if (a==lines[i].q) r = lines[i].p;
					temp = lines[i].h;
				}
				System.out.println(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void HeightSort(Line lines[],int m) {
		for (int i=0;i<m;i++) {
			for (int j=m-1;j>i;j--) {
				if (lines[i].h<lines[j].h) {
					Line temp = new Line(lines[i].h,lines[i].p,lines[i].q);
					lines[i] = lines[j];
					lines[j] = temp;
				}
			}
		}
	}
}