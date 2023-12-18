import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			HashMap<String,Integer> map = new HashMap<String, Integer>();
			String input = in.next();
			int cnt=0;
			int current = 1;//0-current   current+1-input.length
			for(current=1;current<input.length();current++){
				String a = input.substring(0,current);
				String b = input.substring(current);
				String a2 = new StringBuffer(a).reverse().toString();
				String b2 = new StringBuffer(b).reverse().toString();
				map.put(a+b,1);map.put(b+a,1);
				map.put(a+b2,1);map.put(b2+a,1);
				map.put(b+a2,1);map.put(a2+b,1);
				map.put(a2+b2,1);map.put(b2+a2,1);
			}
			System.out.println(map.size());
		}
	}
}