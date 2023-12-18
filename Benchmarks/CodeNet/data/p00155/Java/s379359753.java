import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Building[] b;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N = cin.nextInt();
			if(N==0)break;
			b=new Building[N+1];
			for(int i = 1;i<=N;i++){
				b[i]=new Building(cin.nextInt(),cin.nextInt(),cin.nextInt());
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
				Building[] c = b.clone();
				for(int i = 1;i<c.length;i++){
					c[i].min=1<<30;
				}
				int start=cin.nextInt();
				int goal=cin.nextInt();
				PriorityQueue<A> q=new PriorityQueue<A>();
				c[start].min=0.0;
				c[start].route=""+start;
				q.add(new A(start,0.0));
				
				while(!q.isEmpty()){
					A a = q.poll();
					int now=a.a;
					double dist=a.b;
					for(int i = 0;i<c[now].neibor.size();i++){
						Building nei=c[now].neibor.get(i);
						double dis=c[now].neiborDist.get(i);
						if(nei.min>dist+dis){
							nei.min=dist+dis;
							nei.route=c[now].route+" "+nei.num;
							q.add(new A(nei.num,dist+dis));
						}
					}
				}
				if(c[goal].route.equals("")){
					System.out.println("NA");
					continue;
				}
				String[] ans=c[goal].route.split(" ");
				for(int i = 0;i<ans.length;i++){
					System.out.print(ans[i]);
					if(i!=ans.length-1)System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	static class A implements Comparable{
		int a;
		double b;
		A(int x,double y){
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
	}
}