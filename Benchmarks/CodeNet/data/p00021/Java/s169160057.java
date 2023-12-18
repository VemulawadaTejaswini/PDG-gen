import java.io.*;
import java.util.*;

class Main{
		
		public static void parallel(ArrayList<Double> a){
			double x1,y1,x2,y2,x3,y3,x4,y4;
			x1 = a.get(0);
			y1 = a.get(1);
			x2 = a.get(2);
			y2 = a.get(3);
			x3 = a.get(4);
			y3 = a.get(5);
			x4 = a.get(6);
			y4 = a.get(7);
			if((y2-y1)/(x2-x1) == (y4-y3)/(x4-x3))
				System.out.println("YES");
			else System.out.println("NO");
		}
		
		public static void main(String args[]) throws IOException{
			String str;
			ArrayList <Double> inp = new ArrayList<Double>();

			Scanner scan = new Scanner(System.in);
			
			str = scan.next();
			
			while(scan.hasNext()){
				inp.clear();
				for(int i=0;i<8;i++){
					str = scan.next();
					inp.add(Double.parseDouble(str));
				}
				parallel(inp);
			}
		}
}