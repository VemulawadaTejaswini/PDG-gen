
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	class Log{
		int t;
		int val;
		public Log(int t,int val) {
			this.t=t;
			this.val=val;
		}
	}

	public void run() {
		while(true){
			int N=sc.nextInt(),M=sc.nextInt();
			if(N==0)break;
			int r=sc.nextInt();

			List<Log>[] imos=new ArrayList[M];
			for(int i=0;i<imos.length;i++){
				imos[i]=new ArrayList<Log>();
			}
			for(int i=0;i<r;i++){
				int t=sc.nextInt(),n=sc.nextInt(),m=sc.nextInt()-1,s=sc.nextInt();
				if(s==1){
					imos[m].add(new Log(t,1));
				}else{
					imos[m].add(new Log(t,-1));
				}
			}
			for(int i=0;i<imos.length;i++){
				Collections.sort(imos[i],new Comparator<Log>(){
					@Override
					public int compare(Log o1, Log o2) {
						return o1.t-o2.t;
					}
				});
			}

			int q=sc.nextInt();
			for(int i=0;i<q;i++){
				int ts=sc.nextInt(),te=sc.nextInt(),m=sc.nextInt()-1;
				int time=0,l=0;

				int ind=0;
				Log log;
				if(ind==imos[m].size())log=null;
				else log=imos[m].get(ind);
				for(int t=0;t<ts;t++){
					if(log!=null && log.t==t){
						l+=log.val;
						ind++;
						if(ind==imos[m].size())log=null;
						else log=imos[m].get(ind);
					}
				}
				for(int t=ts;t<te;t++){
					if(log!=null && log.t==t){
						l+=log.val;
						ind++;
						if(ind==imos[m].size())log=null;
						else log=imos[m].get(ind);
					}
					if(l>0)time++;
				}
				ln(time);
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}