import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ1136().doIt();
	}
	
	class AOJ1136{
		void doIt(){
			int set = in.nextInt();
			if(set==0)return;
			int n = in.nextInt();
			Point2D[] p = new Point2D[n];
			for(int i=0;i<n;i++)p[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
			LineSegs input = new LineSegs(p);
//			input.Print();
			for(int i=0;i<set;i++){
				int m = in.nextInt();
				p = new Point2D[m];
				for(int s=0;s<m;s++)p[s] = new Point2D.Double(in.nextDouble(),in.nextDouble());
				LineSegs data = new LineSegs(p);
//				data.Print();
				if(input.equals(data))System.out.println(i+1);;
			}
			System.out.println("+++++");
		}
		
		class LineSegs{
			Lines lines[];
			Point2D p[];
			int n;
			public LineSegs(Point2D[] p){
				n = p.length-1;
				this.p = p;
				lines = new Lines[n];
				for(int i=1;i<=n;i++){
					lines[i-1] = new Lines((int)p[i-1].getX(),(int)p[i-1].getY(),(int)p[i].getX(),(int)p[i].getY());
				}
			}
			
			void Print(){
				System.out.println();
				for(int i=0;i<lines.length;i++)System.out.println(lines[i]);
				System.out.println();
			}
			
			public boolean equals(LineSegs o){
				if(o.n!=this.n)return false;
				boolean sw = true;
				for(int i=0;i<n;i++)if(this.lines[i].sw!=o.lines[i].sw||this.lines[i].dis!=o.lines[i].dis)sw = false;
				if(sw)return true;sw = true;
				for(int i=n-1;i>=0;i--)if(this.lines[n-i-1].sw!=o.lines[i].sw||this.lines[n-i-1].dis!=o.lines[i].dis*-1)sw = false;
				if(sw)return true;sw = true;

				for(int i=0;i<n;i++){
					if(this.lines[i].sw==o.lines[i].sw)sw = false;
					else if(this.lines[i].sw&&!o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis*-1)sw = false;
					}else if(!this.lines[i].sw&&o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis)sw = false;
					}
				}
				if(sw)return true;sw = true;
				
				for(int i=n-1;i>=0;i--){
					if(this.lines[n-i-1].sw==o.lines[i].sw)sw = false;
					else if(this.lines[n-i-1].sw&&!o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis)sw = false;
					}else if(!this.lines[n-i-1].sw&&o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis*-1)sw = false;
					}
				}
				if(sw)return true;sw = true;
				
				for(int i=0;i<n;i++){
					if(this.lines[i].sw!=o.lines[i].sw)sw = false;
					else if(this.lines[i].sw&&o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis*-1)sw = false;
					}else if(!this.lines[i].sw&&!o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis*-1)sw = false;
					}
				}
				if(sw)return true;sw = true;
				
				for(int i=n-1;i>=0;i--){
					if(this.lines[n-i-1].sw!=o.lines[i].sw)sw = false;
					else if(this.lines[n-i-1].sw&&o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis)sw = false;
					}else if(!this.lines[n-i-1].sw&&!o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis)sw = false;
					}
				}
				if(sw)return true;sw = true;
				
				for(int i=0;i<n;i++){
					if(this.lines[i].sw==o.lines[i].sw)sw = false;
					else if(this.lines[i].sw&&!o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis)sw = false;
					}else if(!this.lines[i].sw&&o.lines[i].sw){
						if(this.lines[i].dis!=o.lines[i].dis*-1)sw = false;
					}
				}
				if(sw)return true;sw = true;
				
				for(int i=n-1;i>=0;i--){
					if(this.lines[n-i-1].sw==o.lines[i].sw)sw = false;
					else if(this.lines[n-i-1].sw&&!o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis*-1)sw = false;
					}else if(!this.lines[n-i-1].sw&&!o.lines[i].sw){
						if(this.lines[n-i-1].dis!=o.lines[i].dis)sw = false;
					}
				}
				if(sw)return true;sw = true;
				return false;
			}
		}
		
		class Lines {
			int x1,y1,x2,y2;
			int dis;
			boolean sw;//x移動がtrue  y移動がfalse
			public Lines(int x1,int y1,int x2,int y2) {
				this.x1 =x1;
				this.y1 = y1;
				this.x2 = x2;
				this.y2 = y2;
				dis = 0;
				sw = false;
				if(Math.abs(x1-x2)>0){
					dis = x1-x2;
					sw = true;
				}
				else if(Math.abs(y1-y2)>0){
					dis = y1-y2;
					sw = false;
				}
			}
			public String toString(){
				return dis+" "+sw;
			}
		}
		
	}
}