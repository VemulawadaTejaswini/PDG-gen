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

	long dist;
	int n, m;
	long[] ss, ds;

	void run(){
		dist=sc.nextInt();
		n=sc.nextInt();
		ss=new long[n];
		for(int i=0; i<n; i++){
			ss[i]=sc.nextInt();
		}
		m=sc.nextInt();
		ds=new long[m];
		for(int i=0; i<m; i++){
			ds[i]=sc.nextInt();
		}
		solve();
	}

	void solve(){
		ts=new long[n];
		fill(ts, -1);
		ts[0]=0;
		min=1L<<60;
		rec(0);
		println(min+"");
	}

	long[] ts;

	void rec(int p){
		if(ts[p]==-1){
			return;
		}
		long last=0;
		int det=0;
		for(int i=0; i<n; i++){
			last=max(last, ts[i]+ss[i]*dist);
			if(ts[i]!=-1){
				det++;
			}
		}

		if(det==n){
			check();
			return;
		}
		for(int k=0; k<n; k++){
			if(ts[k]==-1){
				if(k-1>=0&&ts[k-1]!=-1){
					ts[k]=ts[k-1]+1;
					rec(k);
				}
				if(k+1<n&&ts[k+1]!=-1){
					ts[k]=ts[k+1]-1;
					rec(k);
				}
				ts[k]=last-ss[k]*dist;
				rec(k);
				for(int i=0; i<n; i++){
					if(i==k||ts[i]==-1){
						continue;
					}
					for(int j=0; j<m; j++){
						long at=ts[i]+ss[i]*ds[j];
						ts[k]=at-ss[k]*ds[j];
						rec(k);
					}
				}
				ts[k]=-1;
			}
		}
	}

	long min;

	boolean check(){
		boolean ok=true;
		long last=0;
		for(int i=0; i<n; i++){
			last=max(last, ts[i]+ss[i]*dist);
			if(i>0){
				ok&=ts[i]>ts[i-1];
			}
		}
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				if(ss[i]==ss[j]){
					continue;
				}
				double x=1.*(ts[j]-ts[i])/(ss[i]-ss[j]);
				if(0<=x&&x<=dist){}else{
					continue;
				}
				ok&=(ts[j]-ts[i])%(ss[i]-ss[j])==0;
				long at=(ts[j]-ts[i])/(ss[i]-ss[j]);
				if(0<=at&&at<=dist){
					boolean hit=at==dist;
					for(int k=0; k<m; k++){
						hit|=at==ds[k];
					}
					ok&=hit;
				}
			}
		}
		for(int j=0; j<m; j++){
			HashMap<Long, Integer> map=new HashMap<Long, Integer>();
			for(int i=0; i<n; i++){
				long at=ts[i]+ss[i]*ds[j];
				if(!map.containsKey(at)){
					map.put(at, 0);
				}
				map.put(at, map.get(at)+1);
				ok&=map.get(at)<=2;
			}
		}
		if(ok){
//			debug(ts, ok, last);
			min=min(min, last);
		}
		return ok;
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
		new Main().run();
	}
}