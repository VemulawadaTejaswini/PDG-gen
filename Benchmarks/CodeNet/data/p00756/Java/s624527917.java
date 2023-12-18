import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			new AOJ1175().doIt(n);
		}
	}


	class AOJ1175{
		int dfs(long bit,int num){
			if(map.containsKey(bit))return map.get(bit);
//			System.out.println(Long.toBinaryString(bit));
			int result = num;
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)list.add(new ArrayList<Integer>());
			for(int i=0;i<n;i++)if((bit>>i)%2==1){
				Point2D p1 = new Point2D.Double(data[i].x,data[i].y);
				for(int s=i-1;s>=0;s--)if(p1.distance(new Point2D.Double(data[s].x, data[s].y))<data[s].r+data[i].r
						&&(bit>>s)%2==1)list.get(i).add(s);
			}
//			System.out.println(list);
			for(int c=1;c<=4;c++){//color
				for(int i=0;i<n;i++)for(int s=i+1;s<n;s++)if(data[i].color==c&&data[s].color==c&&list.get(i).size()==0&&list.get(s).size()==0){
					if(i==s||((bit>>i)%2==0)||((bit>>s)%2==0))continue;
					bit -= 1 << i;
					bit -= 1 << s;
//					System.out.println(i+" "+s);
					result = Math.max(result, dfs(bit,num+2));
					bit += 1 << i;
					bit += 1 << s;
				}
			}
			if(result == num)return num;
			map.put(bit, result);
			return result; 
		}
		HashMap<Long,Integer> map;
		int n;
		Data data[];
		void doIt(int n){//<=24
			this.n = n;
			map = new HashMap<Long, Integer>();
			data = new Data[n];
			for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			long bit=0;
			for(int i=0;i<n;i++)bit += 1 << i;
			int result = dfs(bit,0);
			System.out.println(result);
		}

		class Data{
			int x,y,color,r;
			public Data(int x,int y,int r,int color) {
				this.x = x;
				this.y = y;
				this.r = r;
				this.color = color;
			}
		}
	}


}