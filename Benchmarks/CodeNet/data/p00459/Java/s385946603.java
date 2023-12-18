import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int p, q, r;
	int[] x, y;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			m=sc.nextInt();
			p=sc.nextInt();
			q=sc.nextInt();
			r=sc.nextInt();
			x=new int[m];
			y=new int[m];
			for(int i=0; i<m; i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		// [left, right)
		// (len<<32)|left
		long[] cards=new long[20000];
		int nCards=0;
		cards[nCards++]=hoge(1, n+1);
		long[] a=new long[20000];
		long[] b=new long[20000];
		long[] c=new long[20000];
		for(int k=0; k<m; k++){
			int ai=0, bi=0, ci=0;
			int left=0, right=0;
			int state=0;
			for(int i=0; i<nCards; i++){
				int offset=(int)cards[i];
				int len=(int)(cards[i]>>>32);
				right+=len;
				boolean xCut=left<x[k]&&x[k]<right;
				boolean yCut=left<y[k]&&y[k]<right;
				if(xCut&&yCut){
					// offset+([0, x[k]-left) + [x[k]-left, y[k]-left) +
					// [y[k]-left, right-left))
					a[ai++]=hoge(offset, offset+x[k]-left);
					b[bi++]=hoge(offset+x[k]-left, offset+y[k]-left);
					c[ci++]=hoge(offset+y[k]-left, offset+len);
					state+=2;
				}else if(xCut){
					// offset+([0, x[k]-left) + [x[k]-left, right-left))
					a[ai++]=hoge(offset, offset+x[k]-left);
					b[bi++]=hoge(offset+x[k]-left, offset+len);
					state++;
				}else if(yCut){
					b[bi++]=hoge(offset, offset+y[k]-left);
					c[ci++]=hoge(offset+y[k]-left, offset+len);
					state++;
				}else{
					if(right<=x[k]){
						a[ai++]=cards[i];
					}else if(right<=y[k]){
						b[bi++]=cards[i];
					}else{
						c[ci++]=cards[i];
					}
				}
				left=right;
			}
			nCards=0;
			for(int i=0; i<ci; i++){
				cards[nCards++]=c[i];
			}
			for(int i=0; i<bi; i++){
				cards[nCards++]=b[i];
			}
			for(int i=0; i<ai; i++){
				cards[nCards++]=a[i];
			}
			if(false){
				debug("k", k);
				for(int i=0; i<nCards; i++){
					int offset=(int)cards[i];
					int len=(int)(cards[i]>>>32);
					debug(offset, len);
				}
				debug();
			}
		}
		p--;
		q--;
		// [p, q]ªrÈº
		// [p, q+1)ªrÈº
		int ans=0;
		q++;
		int left=0, right=0;
		for(int k=0; k<nCards; k++){
			int offset=(int)cards[k];
			int len=(int)(cards[k]>>>32);
			right+=len;

			if(left<=q&&p<=right){
				int min=max(left, p)-left+offset;
				int max=min(right, q)-left+offset;
				// debug("", min, max);
				// [i, j)ÅrÈºÌàÌÍH
				// [i, j)År+1¢ÌàÌÍH
				max=min(max, r+1);
				// debug("", min, max);
				ans+=max(max-min, 0);
			}
			left=right;
		}
		println(ans+"");
	}

	long hoge(long left, long right){
		long offset=left;
		long len=right-left;
		return (len<<32)|offset;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}