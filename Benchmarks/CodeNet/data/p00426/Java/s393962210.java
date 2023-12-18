import java.util.*;

class Tray implements Comparable<Tray>{
	public int[] a;
	public Tray(){
		a=new int[3];
	}
	public int compareTo(Tray t){
		return a[0]!=t.a[0]?a[0]-t.a[0]:a[1]!=t.a[1]?a[1]-t.a[1]:a[2]-t.a[2];
	}
}

class State{
	public Tray tray;
	public int cost;
	public State(Tray t,int c){
		tray=t;
		cost=c;
	}
}
	
class Main{
	public static String toBin(int n){
		String res="";
		for(int i=15;i-->0;)
			res+=(char)('0'+(n>>i&1));
		return res;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt(),m=sc.nextInt();
			if(n==0 && m==0) break;
			
			Tray init=new Tray();
			for(int i=0;i<3;i++){
				int j=sc.nextInt();
				while(j-->0){
					int x=sc.nextInt();
					init.a[i]|=1<<n-x;
				}
			}
			//System.out.println("a:");
			//for(int i=0;i<3;i++)
			//	System.out.println(toBin(init.a[i]));
			
			Queue<State> q=new ArrayDeque<State>();
			q.add(new State(init,0));
			Set<Tray> vis=new TreeSet<Tray>();
			while(q.size()>0){
				Tray ct=q.element().tray;
				int cc=q.element().cost;
				q.remove();
				
				if(vis.contains(ct))
					continue;
				vis.add(ct);
				
				if((ct.a[0]==(1<<n)-1) || (ct.a[2]==(1<<n)-1)){
					System.out.println(cc<=m?cc:-1);
					break;
				}
				
				for(int i=0,j=1;i<2;i++,j++){
					int bit=-1;
					if(ct.a[i]==0 || ct.a[j]==0)
						bit=Math.max(ct.a[i]&-ct.a[i],ct.a[j]&-ct.a[j]);
					else
						bit=Math.min(ct.a[i]&-ct.a[i],ct.a[j]&-ct.a[j]);
					
					Tray nt=new Tray();
					System.arraycopy(ct.a,0,nt.a,0,3);
					nt.a[i]^=bit; nt.a[j]^=bit;
					q.add(new State(nt,cc+1));
				}
			}
		}
	}
}