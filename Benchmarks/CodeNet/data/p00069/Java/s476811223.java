import java.util.*;

class Main {
	//正規ルートを保存
	Scanner sc = new Scanner(System.in);
	public void run() {
		dataset:while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			int m=sc.nextInt()-1,g=sc.nextInt()-1,d=sc.nextInt();
			char[][] map=new char[d][n];
			for(int i=0;i<d;i++){
				map[i]=sc.next().toCharArray();
			}
			int[] root=new int[d+1];
			root[d]=g;
			for(int i=d-1;i>=0;i--){
				if(root[i+1]-1>=0 &&  map[i][root[i+1]-1]=='1'){
					root[i]=root[i+1]-1;
				}else if(n-1>root[i+1] && map[i][root[i+1]]=='1'){
					root[i]=root[i+1]+1;
				}else{
					root[i]=root[i+1];
				}
			}

			int pos=m;
			if(pos==root[0]){
				ln(0);
				continue dataset;
			}

			for(int i=0;i<d;i++){
				if(pos-1>=0 &&  map[i][pos-1]=='1'){
					pos--;
				}else if(n-1>pos && map[i][pos]=='1'){
					pos++;
				}else{
					if(root[i]==pos+1 && (!(pos+1<n-1) || map[i][pos+1]=='0')){
						ln((i+1) +" "+(pos+1));
						continue dataset;
					}else if(root[i]==pos-1 && (!(pos-2>=0)|| map[i][pos-2]=='0')){
						ln((i+1) +" "+(pos-1));
						continue dataset;
					}
				}
			}
			ln(1);
			continue dataset;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}

class P implements Comparable<P>{
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}
	@Override
	public int compareTo(P o) {
		if(x>o.x){
			return 1;
		}else if(x<o.x){
			return -1;
		}
		return y>o.y?1:y<o.y?-1:0;
	}

	public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
	}
	public static  double cross(P a,P b){
		return a.x*b.y-a.y*b.x;
	}
	public static boolean isParallel(P a1,P a2,P b1,P b2){
		return Math.abs(cross(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}
	public static boolean isVertical(P a1,P a2,P b1,P b2){
		return Math.abs(dot(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}

	public P a(P a){
		return new P(x+a.x,y+a.y);
	}
	public P s(P a){
		return new P(x-a.x,y-a.y);
	}

	public double norm(){
		return Math.sqrt(x*x+y*y);
	}

	public static int ccw(P a,P b,P c){
		if(P.cross(b.s(a),c.s(a))>Double.MIN_NORMAL){
			return 1;
		}
		if(P.cross(b.s(a),c.s(a))<-Double.MIN_NORMAL){
			return -1;
		}
		if(P.dot(b,c)<-Double.MIN_NORMAL)return 2;
		if(b.norm()<c.norm()-Double.MIN_NORMAL)return -2;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P){
			P p=(P)obj;
			return x==p.x && y==p.y;
		}
		return false;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}