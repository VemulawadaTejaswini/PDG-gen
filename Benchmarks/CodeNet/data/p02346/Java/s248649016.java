import java.util.*;
import java.io.*;

class Main {

	static int n = 1;
	static int[] seg;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n_ = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int q = Integer.parseInt(line.substring(line.indexOf(" ")+1));

		while (n < n_)
			n *= 2;
		if (n == 1)
			n = 2;

		seg = new int[2*n-1];
		Arrays.fill(seg,0);

		for (int i=0; i<q; i++) {
			line = br.readLine();
			String[] str = line.split(" ");
			int com = Integer.parseInt(str[0]);
			int x = Integer.parseInt(str[1]);
			int y = Integer.parseInt(str[2]);
			if (com == 0)
				update(x,y);
			else
				System.out.println(query(x,y,0,0,n-1));
		}

		br.close();
	}

	static void update(int i,int a){
		i += n-1;
		seg[i] += a;
		while (i > 0) {
			i = (i-1)/2;
			seg[i] = seg[2*i+1] + seg[2*i+2];
		}
	}

	static int query(int a,int b,int i,int l,int r){
		if (r<a || b<l)
			return 0;
		if (a<=l && r<=b){
			return seg[i];
		}else {
			int vl = query(a,b,i*2+1,l,(l+r)/2);
			int vr = query(a,b,i*2+2,(l+r+1)/2,r);
			return vl+vr;
		}
	}
}