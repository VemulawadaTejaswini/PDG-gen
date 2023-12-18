import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	static final int INF =1<<30;

	static class Task{
		char key;
		int e1=-1,e2=-1;
		Task(char _key,int _e1,int _e2){
			key=_key;e1=_e1;e2=_e2;
		}
	}

	int N;
	public void run() {
		TCase:while(true){
			N=sc.nextInt();
			if(N==0)return;
			Task[] tasks=new Task[N];

			for(int i=0;i<N;i++){
				char k=sc.next().charAt(0);
				switch(k){
				case 'W':
					tasks[i]=new Task(k,sc.nextInt(),sc.nextInt());
					break;
				case 'D':
					tasks[i]=new Task(k,sc.nextInt(),-1);
					break;
				case 'R':
					tasks[i]=new Task(k,sc.nextInt(),-1);
					break;
				}
			}

			for(int i=0;i<N;i++)if(tasks[i].key=='R'){
				int p=tasks[i].e1+1;
				int e=-1;
				int count=0;
				HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
				for(int j=0;j<i;j++){
					switch(tasks[j].key){
					case 'W':
						if(count+tasks[j].e2>=p && e==-1){
							e=tasks[j].e1;
						}
						int v=0;
						if(count+tasks[j].e2>=p)v=count+tasks[j].e2-p;
						else v+=tasks[j].e2;
						if(hash.containsKey(tasks[j].e1)){
							hash.put(tasks[j].e1,hash.get(tasks[j].e1)+v);
						}else{
							hash.put(tasks[j].e1,v);
						}
						count=min(count+tasks[j].e2,p);
						break;
					case 'D':
						if(tasks[j].e1==e)e=-1;
						if(hash.containsKey(tasks[j].e1)){
							Integer c=hash.get(tasks[j].e1);
							count-=c;
							hash.put(tasks[j].e1,0);
						}
						break;
					}
				}
				ln(e);
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