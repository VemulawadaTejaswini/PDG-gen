
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	class Query implements Comparable<Query>{
		int t,pos;
		int id;
		double res;
		Query(int id,int _pos,int _t){
			this.id=id;t=_t;pos=_pos;
		}

		@Override
		public int compareTo(Query o) {
			return t-o.t;
		}
	}

	public Comparator<Query> comp=new Comparator<Main.Query>() {
		@Override
		public int compare(Query o1, Query o2) {
			return o1.id-o2.id;
		}
	};
	class Tank{
		double lh,rh;
		double water;
		int lpos,rpos;
		public Tank(double _lh,double _rh,double _water,int _lpos,int _rpos){
			lh=_lh;rh=_rh;water=_water;lpos=_lpos;rpos=_rpos;
		}
	}

	public void run() {
		int D=sc. nextInt();
		Case: while (D--!=0) {
			int N=sc.nextInt();
			int[] hpos=new int[N+2];double[] hs=new double[N+2];
			hpos[0]=0;hs[0]=50;
			for(int i=1;i<N+1;i++){
				hpos[i]=sc.nextInt();
				hs[i]=sc.nextInt();
			}
			hpos[N+1]=100;hs[N+1]=50;

			List<Tank> tanks=new ArrayList<Tank>();
			for(int i=0;i<N+1;i++)
				tanks.add(new Tank(hs[i],hs[i+1],0,hpos[i],hpos[i+1]));

			int M=sc.nextInt();
			int[] fpos=new int[M];double[] fs=new double[M];
			for(int i=0;i<M;i++){
				fpos[i]=sc.nextInt();fs[i]=sc.nextInt();
			}
			int L=sc.nextInt();
			Query[] qs=new Query[L];
			for(int i=0;i<L;i++){
				qs[i]=new Query(i,sc.nextInt(),sc.nextInt());
			}
			Arrays.sort(qs);

			int t=0;
			for(int i=0;i<L;i++){
				int dt=qs[i].t-t;
				t=qs[i].t;

				for(int j=0;j<M;j++){
					int pos=-1;
					for(int k=0;k<tanks.size();k++){
						if(tanks.get(k).lpos<fpos[j] && fpos[j]<tanks.get(k).rpos){
							pos=k;break;
						}
					}
					Tank tank=tanks.get(pos);
					tank.water+=dt*fs[j]/30;

					//ならせるまでならす
					flow:while(true){
						for(int k=0;k<tanks.size();k++){
							Tank p=tanks.get(k);
							if(p.lh<p.rh){
								if(p.lh*(p.rpos-p.lpos)<p.water){
									double res=p.water-p.lh*(p.rpos-p.lpos);
									p.water=p.lh*(p.rpos-p.lpos);
									if(k-1>=0){
										Tank nxt=tanks.get(k-1);
										nxt.water+=res;
										if(nxt.rh<nxt.lh && nxt.rh*(nxt.rpos-nxt.lpos)<=nxt.water){
											p.water+=nxt.water;
											p.lpos=nxt.lpos;p.lh=nxt.lh;
											tanks.remove(nxt);
										}
									}
									continue flow;
								}
							}else{
								if(p.rh*(p.rpos-p.lpos)<p.water){
									double res=p.water-p.rh*(p.rpos-p.lpos);
									p.water=p.rh*(p.rpos-p.lpos);
									if(k+1<tanks.size()){
										Tank nxt=tanks.get(k+1);
										nxt.water+=res;
										if(nxt.lh<nxt.rh && nxt.lh*(nxt.rpos-nxt.lpos)<=nxt.water){
											p.water+=nxt.water;
											p.rpos=nxt.rpos;p.rh=nxt.rh;
											tanks.remove(nxt);
										}
									}
									continue flow;
								}
							}
						}
						break;
					}
				}
				int pos=-1;
				for(int k=0;k<tanks.size();k++){
					if(tanks.get(k).lpos<qs[i].pos && qs[i].pos <tanks.get(k).rpos){
						pos=k;break;
					}
				}
				Tank res=tanks.get(pos);
				qs[i].res=res.water/(res.rpos-res.lpos);
			}
			Arrays.sort(qs,comp);
			for(int i=0;i<L;i++)
				ln(qs[i].res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static Scanner sc = new Scanner(in);

	//output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	//	static String str(Double o){
	//		return String.format("%.8f",o);
	//	}
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}