import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main{
	//for(Map.Entry<Object, Object> e: map.entrySet()){ ...
	public static void main(String[] args){
		try{
//-*-*- tp start -*-*-
			final int INF = Integer.MAX_VALUE, MINF = Integer.MIN_VALUE;
			SpecialComparator scomparator = new SpecialComparator();
			Scanner s = new Scanner(System.in);
//-*-*- tp end -*-*-
			//write a program...
			double x=0, y=0;
			while(s.hasNext()){
				double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble(),
					d = s.nextDouble(), e = s.nextDouble(), f = s.nextDouble();
				if(a==0&&e==0){ y=c/b; x=f/d;}
				else if(b==0&&d==0){ x=c/a; y=f/e;}
				else if(a==0){ y=c/b; x=(f-e*y)/d;}
				else if(b==0){ x=c/a; y=(f-d*x)/e;}
				else if(d==0){ y=f/e; x=(c-b*y)/a;}
				else if(e==0){ x=f/d; y=(c-a*x)/b;}
				else{
				double tmp = d/a; a = d; b = b*tmp; c = c*tmp;
				y = (f-c)/(e-b);
				x = (f-e*y)/d;
				}
				if(x==-0) x=0;
				if(y==-0) y=0;
				System.out.printf("%.3f %.3f", x, y);
			}
//-*-*- tp start -*-*-
		}catch(Exception e){
			e.printStackTrace();
		}
	}
//-*-*- tp end -*-*-
	//functions
//-*-*- tp start -*-*-
	private static void debugl(Object obj){
		System.out.println(obj);
	}
	private static void debug(Object obj){
		System.out.print(obj);
	}
	private static String toStrmd(Object[] obj){
		return Arrays.deepToString(obj);
	}
}

class SpecialComparator implements Comparator{
	private int index = 0;
	public void setIndex(int index){
		this.index = index;
	}
	public int compare(Object a, Object b){
		String[] sa = (String[])a;
		String[] sb = (String[])b;
		return (sa[index].compareTo(sb[index]));
	}
}
//-*-*- tp end -*-*-