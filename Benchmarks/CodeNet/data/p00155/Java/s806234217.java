import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Building[] b;
	static HashMap<Integer,Integer> map;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N = cin.nextInt();
			if(N==0)break;
			b=new Building[N+1];
			map=new HashMap<Integer,Integer>();
			for(int i = 1;i<=N;i++){
				b[i]=new Building(cin.nextInt(),cin.nextInt(),cin.nextInt());
				map.put(b[i].num, i);
			}
			for(int i = 1;i<=N;i++){
				for(int j = 1;j<=N;j++){
					if(i==j)continue;
					if(b[i].isNeibor(b[j])){
						b[i].neibor.add(b[j]);
						b[i].neiborDist.add(b[i].kyori(b[j]));
					}
				}
			}
			int M = cin.nextInt();
			
			while(M--!=0){
				for(int i = 1;i<b.length;i++){
					b[i].init();
				}
				int start=cin.nextInt();
				start=map.get(start);
				int goal=cin.nextInt();
				goal=map.get(goal);
				PriorityQueue<A> q=new PriorityQueue<A>();
				b[start].min=0.0;
				//b[start].route=""+start;
				b[start].pre=b[start];
				q.add(new A(b[start],0.0));
				
				while(!q.isEmpty()){
					A a = q.poll();
					Building now=a.a;
					now.route=now.pre.route+" "+now.num;
					double dist=a.b; 
					for(int i = 0;i<now.neibor.size();i++){
						Building nei=now.neibor.get(i);
						double dis=now.neiborDist.get(i);
						if(nei.min>dist+dis){
							nei.min=dist+dis;
							nei.pre=now;
							//nei.route=b[now].route+" "+nei.num;
							q.add(new A(nei,dist+dis));
						}
					}
				}
				if(b[goal].route.equals("")){
					System.out.println("NA");
					continue;
				}
				System.out.println(b[goal].route.trim());
			}
		}
	}
	static class A implements Comparable{
		Building a;
		double b;
		A(Building x,double y){
			a=x;b=y;
		}
		@Override
		public int compareTo(Object o) {
			A a = (A)o;
			double d=this.b-a.b;
			if(d<0.0)return -1;
			else if(d==0.0)return 0;
			else return 1;
		}
	}
	static class Building{
		String route;
		Building pre;
		ArrayList<Building> neibor = new ArrayList<Building>();
		ArrayList<Double> neiborDist = new ArrayList<Double>();
		double min=1<<30;
		int num,x,y;
		Building(int c,int a,int b){
			min=1<<30;
			route="";
			num=c;
			x=a;y=b;
		}
		boolean isNeibor(Building b){
			double x = kyori(b);
			if(x<=50.00000000){
				return true;
			}
			else{
				return false;
			}
		}
		double kyori(Building b){
			double d1=(this.x-b.x)*(this.x-b.x);
			double d2=(this.y-b.y)*(this.y-b.y);
			return Math.sqrt((d1+d2));
		}
		void init(){
			route="";
			min=1<<30;
			pre=null;
		}
	}
}