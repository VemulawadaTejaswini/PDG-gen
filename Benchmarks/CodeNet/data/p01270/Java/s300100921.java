

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	static final int INF =1<<30;

	static class S{
		long id,s,e;
		S(long _id,long _s,long _e){
			id=_id;s=_s;e=_e;
		}
	}

	int N;
	public void run() {
		Case:while(true){
			N=sc.nextInt();
			if(N==0)return;

			LinkedList<S> segs=new LinkedList<S>();
			for(int i=0;i<N;i++){
				char k=sc.next().charAt(0);
				switch(k){
				case 'W':
					int id=sc.nextInt(),len=sc.nextInt();
					List<S> tmp=new LinkedList<S>();
					long s=0,e=len;
					while(!segs.isEmpty()){
						S seg=segs.poll();
						if(len==0){
							tmp.add(seg);
							while(!segs.isEmpty())
								tmp.add(segs.poll());
							break;
						}
						if(seg.s>s){
							e=min(s+len,seg.s);
							len-=e-s;
							tmp.add(new S(id,s,e));
						}
						tmp.add(seg);
						s=seg.e;
					}
					if(len!=0)tmp.add(new S(id,s,s+len));
					segs.clear();
					segs.addAll(tmp);
					break;
				case 'D':
					id=sc.nextInt();
					tmp=new LinkedList<S>();
					while(!segs.isEmpty()){
						S seg=segs.poll();
						if(seg.id!=id)
							tmp.add(seg);
					}
					segs.clear();
					segs.addAll(tmp);
					break;
				case 'R':
					int p=sc.nextInt();
					boolean ex=false;
					for(S seg:segs){
						if(seg.s<=p && p<seg.e){
							ex=true;
							ln(seg.id);
						}
					}
					if(!ex)ln(-1);
					break;
				}
			}
			ln();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(Boolean o){
		return o?"YES":"NO";
	}
//	static String str(Double o){
//		return String.format("%.8f",o);
//	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}

	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		Class<?> c=o.getClass();
		if(c.equals(Boolean.class))return str((Boolean)o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}