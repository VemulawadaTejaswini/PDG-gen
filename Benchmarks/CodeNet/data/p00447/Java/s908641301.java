import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ0524().doIt();
	}
	
	class AOJ0524{
		void doIt(){
			int m = in.nextInt();
			if(m==0)return;
			ArrayList<Integer> x= new ArrayList<Integer>(),y= new ArrayList<Integer>();
			for(int i=0;i<m;i++){
				x.add(in.nextInt());
				y.add(in.nextInt());
			}
			Stars target = new Stars(x, y);
//			System.out.println(target.min_index);
			int n = in.nextInt();
			ArrayList<Integer> tx = new ArrayList<Integer>(),ty = new ArrayList<Integer>();
			HashSet<String> set = new HashSet<String>();
			for(int i=0;i<n;i++){
				tx.add(in.nextInt());ty.add(in.nextInt());
				set.add(tx.get(tx.size()-1)+" "+ty.get(ty.size()-1));
			}
			for(int i=0;i<n;i++){//一点ずつ見ていく。
				int sx = target.x.get(target.min_index)-tx.get(i);
				int sy = target.y.get(target.min_index)-ty.get(i);
//				System.out.println(sx+" "+sy);
				boolean sw = true;
				for(int s=0;s<target.n;s++){
					if(!(set.contains((target.x.get(s)-sx)+" "+(target.y.get(s)-sy))))sw=false;
				}
				if(sw){
					System.out.println((sx*-1)+" "+(sy*-1));
					break;
				}
			}
		}
		
		class Stars{
			ArrayList<Integer> x,y;
			int n;
			int min_index;
			public Stars(ArrayList<Integer> x,ArrayList<Integer> y){
				this.x = new ArrayList<Integer>();
				this.y = new ArrayList<Integer>();
				this.n = x.size();
				for(int i=0;i<n;i++){
					this.x.add(x.get(i));
					this.y.add(y.get(i));
				}
				min_index = 0;
				double min=Double.MAX_VALUE;
				for(int i=0;i<n;i++){
					if(min>new Point2D.Double(x.get(i), y.get(i)).distance(0,0)){
						min_index = i;
						min = new Point2D.Double(x.get(i), y.get(i)).distance(0,0);
					}
				}
			}
		}
	}
}