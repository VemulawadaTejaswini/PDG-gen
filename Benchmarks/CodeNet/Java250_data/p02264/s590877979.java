import java.io.*;
import java.util.*;
class P{
	P(String n,int t){
		this.n=n;
		this.t=t;
	}
	public String n;
	public int t,e;
}
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String l[];
		l=br.readLine().split(" ");
		int n=Integer.parseInt(l[0]);
		int q=Integer.parseInt(l[1]);
		LinkedList<P> p=new LinkedList<P>();
		P[] e=new P[n];
		int c=0;
		for(int i=0;i<n;i++){
			l=br.readLine().split(" ");
			p.offer(new P(l[0],Integer.parseInt(l[1])));
		}
		int s=0;
		for(;;){
			P t=p.poll();
			if(t==null)break;
			int d=Math.min(t.t,q);
			s+=d;
			t.t-=d;
			if(t.t==0){
				t.e=s;
				e[c++]=t;
			}else{
				p.add(t);
			}
		}
		for(int i=0;i<n;i++)System.out.println(e[i].n+' '+e[i].e);
	}
}