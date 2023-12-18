import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{

	public static void check_convec(ArrayList<Double> list){
		double xa,ya,xb,yb,xc,yc,xd,yd,p1,p2;
	
		xa = list.get(0);
		ya = list.get(1);
		xb = list.get(2);
		yb = list.get(3);
		xc = list.get(4);
		yc = list.get(5);
		xd = list.get(6);
		yd = list.get(7);
		
		
		p1 = ((xa-xc)*(yb-ya) + (ya-yc)*(xa-xb)) * ((xa-xc)*(yd-ya) + (ya-yc)*(xa-xd));
		p2 = ((xb-xd)*(ya-yb) + (yb-yd)*(xb-xa)) * ((xb-xd)*(yc-yb) + (yb-yd)*(xb-xc));

		if(p1 > 0 || p2 > 0) System.out.println("NO");
		else System.out.println("YES");
		
	}
	

	public static void print_convex(ArrayList<Double> list){
		ArrayList <Double> inp = new ArrayList<Double>();
		
		for(int i=0;i<list.size()/8;i++){
			for(int j=0;j<8;j++){
				inp.add(list.get(i*8+j));
			}
			check_convec(inp);
			inp.clear();
		}

	}
		
	public static void main(String args[]) throws IOException{
		String str;
		ArrayList <Double> inp = new ArrayList<Double>();

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			str = scan.next();
			String [] strAry = new String[str.length()];
			strAry = str.split(",");
			for(int j=0;j<strAry.length;j++){
				Pattern p = Pattern.compile("[0-9].[0-9]");
				Matcher m = p.matcher(strAry[j]);
				if(m.find()){
					double x = Double.parseDouble(m.group(0));
					inp.add(x);
				}
			}
		}
		print_convex(inp);
	}
}