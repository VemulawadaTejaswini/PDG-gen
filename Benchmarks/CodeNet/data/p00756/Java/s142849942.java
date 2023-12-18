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
		void doIt(int n){//<=24
			Data[] data = new Data[n];
			for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			boolean sw = true;
			boolean[] remove = new boolean[n];
			Arrays.fill(remove, true);
			while(sw){
				sw = false;
				ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
				for(int i=0;i<n;i++)list.add(new ArrayList<Integer>());
				for(int i=0;i<n;i++)if(remove[i]){
					Point2D p1 = new Point2D.Double(data[i].x,data[i].y);
					for(int s=i-1;s>=0;s--)if(p1.distance(new Point2D.Double(data[s].x, data[s].y))<data[s].r+data[i].r
							&&remove[s])list.get(i).add(s);
				}
//				System.out.println(list);
				int flg[] = new int[5];
				for(int i=0;i<n;i++)if(remove[i]&&list.get(i).size()==0)flg[data[i].color]++;
				for(int i=0;i<n;i++)if(remove[i]){
					if(flg[data[i].color]==2){
						remove[i] = false;
						sw = true;
					}
				}
			}
			int cnt = 0;
			for(int i=0;i<n;i++)if(!remove[i])cnt++;
			System.out.println(cnt);
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