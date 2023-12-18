import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int Case=sc.nextInt();sc.nextLine();
		while (Case--!=0){
			String str=sc.nextLine();
			int n=sc.nextInt();sc.nextLine();
			int cursor=0;
			for(int i=0;i<n;i++){
				String op=sc.nextLine();
				if("forward word".equals(op)){
					boolean through=false;
					while(!through || cursor<str.length() && str.charAt(cursor)!=' '){
						cursor++;
						through=true;
					}
					if(cursor<str.length())cursor++;
				}else if("forward char".equals(op)){
					if(cursor<str.length()-1)cursor++;
				}else if("backward word".equals(op)){
					boolean through=false;
					while(!through ||  cursor>0 && str.charAt(cursor)!=' '){
						cursor--;
						through=true;
					}
					if(cursor>0)cursor--;
					if(cursor<0)cursor=0;
				}else if("backward char".equals(op)){
					if(cursor>0)cursor--;
				}else if("delete char".equals(op)){
					if(1<=cursor && cursor <str.length())str=str.substring(0,cursor-1)+str.substring(cursor);
				}else if("delete word".equals(op)){
					if(cursor>str.length())continue;
					int e=cursor;
					while(str.length()>e && str.length()>0 && str.charAt(e)!=' ')e++;
					str=str.substring(0,cursor)+str.substring(e);
				}else if(op.startsWith("insert")){
					int s=-1,e=-1;
					for(int index=0;index<op.length();index++){
						if(op.charAt(index)=='"'){
							if(s==-1)s=index;
							else e=index;
						}
					}
					String word=op.substring(s+1,e);
					str=str.substring(0,cursor)+word+str.substring(cursor);
					cursor+=word.length();
				}
			}
			ln(str.substring(0,cursor)+"^"+str.substring(cursor));
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


class P {
	double x, y;
	public static final double EPS = 1e-10;

	P(double _x, double _y) {
		x = _x;
		y = _y;
	}

	public static final P Xunit = new P(1, 0);
	public static final P Yunit = new P(0, 1);
	public static final P O = new P(0, 0);
	public static double cross(P a, P b) {
		return a.x * b.y - a.y * b.x;
	}
	public P s(P a) {
		return new P(x - a.x, y - a.y);
	}
	public static double getS(List<P> plist) {
		P o1 = plist.get(0);
		P prev = plist.get(1);
		double S = 0;
		for (P p : plist.subList(2, plist.size())) {
			S += getS(o1, prev, p);
			prev = p;
		}
		return S;
	}
	// 負値がかえることもあるので注意。
	public static double getS(P o, P a, P b) {
		return cross(a.s(o), b.s(o)) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P) {
			P p = (P) obj;
			return x == p.x && y == p.y;
		}
		return false;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}