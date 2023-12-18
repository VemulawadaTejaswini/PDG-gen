import java.util.*;
public class Main{
static int n;
    
    static ArrayList<ArrayList<pair>> m;
    static int[]amo;//count of factor
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j,k,u,v;
     Scanner sca=new Scanner(System.in);
     n=sca.nextInt();
     m=new ArrayList<ArrayList<pair>>();
     for(i=0;i<n;i++){
    	 u=sca.nextInt();
    	 k=sca.nextInt();
        ArrayList<pair> mini=new ArrayList<pair>();
    	 for(j=0;j<k;j++){
    	       v=sca.nextInt();
	       mini.add(new pair(v,sca.nextInt()));
    	 }
	 m.add(mini);
     }
     dijkstra();
    }
    public static void dijkstra(){
	int i,u,v,myn;
		pair hz;
	       	PriorityQueue<pair> qu=new PriorityQueue<pair>((p1,p2)->Integer.compare(p1.getdis(),p2.getdis()));
	  int d[]= new int[n];
	int[] check=new int[n];//checked ->1,yet-> 0checking->2
		for(i=0;i<n;i++){
			d[i]=Integer.MAX_VALUE;
		}
		d[0]=0;
		qu.add(new pair(0,0));
		check[0]=2;
		while(!qu.isEmpty()){
		    hz=qu.poll();
		    u=hz.getnext();
			check[u]=1;
			if(d[u]<hz.getdis())continue;
			myn=m.get(u).size();
			for(i=0;i<myn;i++){
			    v=m.get(u).get(i).getnext();
			 if(check[v]==1)continue;
			 if(d[v]>d[u]+m.get(u).get(i).getdis()){
			     d[v]=d[u]+m.get(u).get(i).getdis();
			     qu.add(new pair(v,d[v]));
			     check[v]=2;
			 }
			}
		}
		for(i=0;i<n;i++){
			if(d[i]==Integer.MAX_VALUE)d[i]=-1;
			System.out.println(i+" "+d[i]);
		}
	}
}
class pair{
    int next,dis;
    pair(int next,int dis){
	this.next=next;
	this.dis=dis;
    }
   public int getnext(){
	return next;
    }
   public  int getdis(){
	return dis;
    }
}

