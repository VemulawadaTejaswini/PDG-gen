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
			int a[] = new int[n];int b[] = new int[n];
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();b[i] = in.nextInt();
			}
			LineSegs base = new LineSegs(a, b);
			for(int i=0;i<set;i++){
				n = in.nextInt();
				a = new int[n];b = new int[n];
				for(int s=0;s<n;s++){
					a[s] = in.nextInt();b[s] = in.nextInt();
				}
				if(base.equals(a,b))System.out.println(i+1);
			}
			System.out.println("+++++");
		}

		class LineSegs{
			private ArrayList<Integer> x1,y1,x2,y2;
			private int n;
			public LineSegs(int a[],int b[]) {
				n = a.length;
				x1 = new ArrayList<Integer>();
				y1 = new ArrayList<Integer>();
				x2 = new ArrayList<Integer>();
				y2 = new ArrayList<Integer>();
				for(int i=0;i<n;i++){
					x1.add(a[i]);
					y1.add(b[i]);
					x2.add(a[i]);
					y2.add(b[i]);
				}
				Collections.reverse(x2);Collections.reverse(y2);
			}
			public boolean equals(int[] a,int b[]){
				if(this.n!=a.length)return false;
				ArrayList<Integer> x3 = new ArrayList<Integer>();
				ArrayList<Integer> y3 = new ArrayList<Integer>();
				for(int i=0;i<n;i++){
					x3.add(a[i]);y3.add(b[i]);
				}
//				System.out.println(x3);
//				System.out.println(y3);
				boolean sw = true;
				//0属
				for(int i=1;i<n;i++){
					int yoko = x1.get(i)-x1.get(i-1);
					int tate = y1.get(i)-y1.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(tate!=tate2||yoko!=yoko2)sw = false;
				}
				if(sw)return true;sw = true;
				
				for(int i=1;i<n;i++){
					int yoko = x2.get(i)-x2.get(i-1);
					int tate = y2.get(i)-y2.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(tate!=tate2||yoko!=yoko2)sw = false;
				}
				if(sw)return true;sw = true;
				
				//90属
				for(int i=1;i<n;i++){
					int yoko = x1.get(i)-x1.get(i-1);
					int tate = y1.get(i)-y1.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(!(yoko==tate2*-1&&tate==yoko2))sw=false;
				}
				if(sw)return true;sw = true;
				for(int i=1;i<n;i++){
					int yoko = x2.get(i)-x2.get(i-1);
					int tate = y2.get(i)-y2.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(!(tate==yoko2&&yoko*-1==tate2))sw=false;
				}
				if(sw)return true;sw = true;
				
				//180属
				for(int i=1;i<n;i++){
					int yoko = x1.get(i)-x1.get(i-1);
					int tate = y1.get(i)-y1.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(!(tate==tate2*-1&&yoko*-1==yoko2))sw=false;
				}
				if(sw)return true;sw = true;
				for(int i=1;i<n;i++){
					int yoko = x2.get(i)-x2.get(i-1);
					int tate = y2.get(i)-y2.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
//					System.out.println(yoko+" "+tate);
//					System.out.println(yoko2+" "+tate2);
//					System.out.println();
					if(!(tate==tate2*-1&&yoko*-1==yoko2))sw=false;
				}
				if(sw)return true;sw = true;
				
				//270属
				for(int i=1;i<n;i++){
					int yoko = x1.get(i)-x1.get(i-1);
					int tate = y1.get(i)-y1.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(!(yoko==tate2&&tate==yoko2*-1))sw=false;
				}
				if(sw)return true;sw = true;
				for(int i=1;i<n;i++){
					int yoko = x2.get(i)-x2.get(i-1);
					int tate = y2.get(i)-y2.get(i-1);
					int yoko2 = x3.get(i)-x3.get(i-1);
					int tate2 = y3.get(i)-y3.get(i-1);
					if(!(yoko==tate2&&tate==yoko2*-1))sw=false;
				}
				if(sw)return true;sw = true;
				return false;
			}
		}
	}



}