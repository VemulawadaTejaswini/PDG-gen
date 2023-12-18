import java.util.*;

public class Main {
	final static int TIME=1, COST=0;
	static int TYPE;
	static int start;
	static int goal;
	static int V;
	static int E;
	static int request;
	static boolean[] already;
	static Vertex[] v;
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		while(true){
			E=cin.nextInt();
			V=cin.nextInt();
			if(E+V==0){
				return;
			}
			v = new Vertex[V+1];
			
			for(int i = 1; i <= V; i++){
				v[i]=new Vertex(i);
			}
			for(int i = 1; i <= E; i++){
				int a = cin.nextInt();
				int b = cin.nextInt();
				int c = cin.nextInt();
				int t = cin.nextInt();
				v[a].costtime[TIME][b]=t;
				v[b].costtime[TIME][a]=t;
				v[a].costtime[COST][b]=c;
				v[b].costtime[COST][a]=c;
			}
			request = cin.nextInt();
			while(request--!=0){
				already = new boolean[V+1];
				for(int i = 1; i <= V;i++){
					v[i].init();
				}
				start = cin.nextInt();
				goal = cin.nextInt();
				TYPE = cin.nextInt();
				di();
				System.out.println(v[goal].min);	
			}
		}
	}
	static void di(){
		PriorityQueue<Pair> q = new PriorityQueue<Pair>();
		q.add(new Pair(start, 0));
		while(!q.isEmpty()){
			Pair p = q.poll();
			v[p.num].min=p.value;
			already[p.num]=true;
			if(p.num==goal){
				break;
			}
			for(int i = 1; i <= V; i++){
				int val = v[p.num].costtime[TYPE][i];
				if(!already[i] && val!=-1 
						&& val+p.value < v[i].min){
					q.add(new Pair(i, val+p.value));
				}
			}
		}
	}
}
class Pair implements Comparable{
	int num;
	int value;
	Pair(int a, int b){
		num=a;
		value=b;
	}
	public int compareTo(Object o){
		Pair p = (Pair)o;
		return (this.value-p.value);
	}
}
class Vertex{
	int num;
	int min=Integer.MAX_VALUE;
	int costtime[][];
	void init(){
		min=Integer.MAX_VALUE;
	}
	Vertex(int n){
		num=n;
		costtime= new int[2][301];
		for(int i = 0; i < 2; i++){
			for(int j  =0; j < 301; j++){
				costtime[i][j]=-1;
			}
		}
		min=Integer.MAX_VALUE;
	}
}