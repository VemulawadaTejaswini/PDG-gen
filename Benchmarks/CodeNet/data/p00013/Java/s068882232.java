import java.io.*;
import java.util.*;

class Main{
		private static ArrayList<String> check_point(ArrayList<Double> a){
			ArrayList<String> b = new ArrayList<String>();
			for(int i=0;i<a.size()/8;i++){
				String ch = "YES";
				double x1,y1,x2,y2,x3,y3,xp,yp;
				x1 = a.get(i*8);
				y1 = a.get(i*8+1);
				x2 = a.get(i*8+2);
				y2 = a.get(i*8+3);
				x3 = a.get(i*8+4);
				y3 = a.get(i*8+5);
				xp = a.get(i*8+6);
				yp = a.get(i*8+7);
				if(((x3 * (y1-y2) + y3 * (x2 - x1) +x1 * y2 - x2 * y1) * (xp * (y1-y2) + yp * (x2 - x1) +x1 * y2 - x2 * y1)) < 0) ch = "NO";
				else if (((x3 * (y1-y2) + y3 * (x2 - x1) +x1 * y2 - x2 * y1) * (xp * (y1-y2) + yp * (x2 - x1) +x1 * y2 - x2 * y1)) < 0) ch = "NO";
				else if (((x1 * (y2-y3) + y1 * (x3 - x2) +x2 * y3 - x3 * y2) * (xp * (y2-y3) + yp * (x3 - x2) +x2 * y3 - x3 * y2)) < 0 )ch = "NO";
				else if (((x2 * (y3-y1) + y2 * (x1 - x3) +x3 * y1 - x1 * y3) * (xp * (y3-y1) + yp * (x1 - x3) +x3 * y1 - x1 * y3)) < 0) ch = "NO";
				b.add(ch);
			}
			return b;
		}
		
		public static void main(String args[]) throws IOException{
			ArrayList<Integer> inp = new ArrayList<Integer>();
			ArrayList<Integer> out = new ArrayList<Integer>();
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
				String str1 = scan.next();
				inp.add(Integer.valueOf(str1).intValue());
			}
			
			for(int i=0;i<inp.size();i++){
				if(inp.get(i) != 0) out.add(inp.get(i));
				else{
					System.out.println(out.get(out.size()-1));
					out.remove(out.size()-1);
					}
			}
	}
}