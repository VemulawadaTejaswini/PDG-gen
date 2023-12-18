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
		new AOJ1180();
	}
	class AOJ1180{
		int max(int num,int keta){
			String a = Integer.toString(num);
			for(;keta>a.length();)a="0"+a;
			char[] b = a.toCharArray();
			Arrays.sort(b);a="";
			for(int i=b.length-1;i>=0;i--)a+=b[i];
			return Integer.parseInt(a);
		}
		
		int min(int num,int keta){
			String a = Integer.toString(num);
			for(;keta>a.length();)a="0"+a;
			char[] b = a.toCharArray();
			Arrays.sort(b);a="";
			for(int i=0;i<b.length;i++)a+=b[i];
			return Integer.parseInt(a);
		}
		
		
		public AOJ1180() {
			while(true){
				HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
				ArrayList<Integer> list = new ArrayList<Integer>();
				int num = in.nextInt();
				int keta = in.nextInt();
				if(num+keta==0)break;
				int cnt=0;
				while(!map.containsKey(num)){
					map.put(num,cnt);
					list.add(num);
					cnt++;
					int m1 = max(num,keta);
					int m2 = min(num,keta);
					num = m1-m2;
				}
				System.out.println(map.get(num)+" "+num+" "+(cnt-map.get(num)));
			}
		}
	}
}