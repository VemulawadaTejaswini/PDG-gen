
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = 0;
		int m = 0;
		int count = 0;
		int[] h = new int[1500];
		int[] w = new int[1500];
		int[] hh = new int[1500001];
		int[] ww = new int[1500001];
		while(true){
			n = Integer.parseInt(stdIn.next());
			m = Integer.parseInt(stdIn.next());
			if(n==0 && m==0){
				break;
			}
			Arrays.fill(h,0);
			Arrays.fill(w,0);
			Arrays.fill(hh,0);
			Arrays.fill(ww,0);
			count = 0;
			for(int i=0;i<n;i++){
				h[i] = Integer.parseInt(stdIn.next());
			}
			for(int i=0;i<m;i++){
				w[i] = Integer.parseInt(stdIn.next());
			}
			for(int i=0;i<n;i++){
				int c = 0;
				for(int j=i;j<n;j++){
					c += h[j];
					hh[c]++;
				}
			}
			for(int i=0;i<m;i++){
				int c = 0;
				for(int j=i;j<m;j++){
					c += w[j];
					ww[c]++;
				}
			}

			for(int i=0;i<1500001;i++){
				count += hh[i]*ww[i];
			}

			out.println(count);
			out.flush();
		}
	}
}