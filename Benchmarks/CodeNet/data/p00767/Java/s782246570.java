import java.awt.geom.Point2D;
import java.util.*;


public class Main {
		Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1186();
	}
	
	class problem_A{
		public problem_A() {
//			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] list = new int[n];
			for(int i=0;i<n;i++)list[i] = in.nextInt();
			Arrays.sort(list);
			
		}
	}
	
	class AOJ1186{
		ArrayList<Object> list; 
		final int N = 150*150;
		public AOJ1186() {
			list = new ArrayList<Object>();
			for(int i=1;i<=150;i++)for(int s=i+1;s<=150;s++)list.add(new Object(i, s));
			Collections.sort(list);
			while(true){
				int h = in.nextInt();
				int w = in.nextInt();
				if(h+w==0)break;
				doIt(h, w);
			}
		}
		void doIt(int h,int w){
			for(int i=0;i<list.size();i++)if(list.get(i).h==h&&list.get(i).w==w){
				System.out.println(list.get(i+1).h+" "+list.get(i+1).w);
				break;
			}
		}
	}
	class Object implements Comparable<Object>{
		int h,w;
		int diagonal;
		public Object(int h,int w) {
			this.h = h;
			this.w = w;
			diagonal = h*h+w*w;
		}
		public int compareTo(Object o) {
			if(this.diagonal>o.diagonal)return 1;
			else if(this.diagonal<o.diagonal)return -1;
			else if(this.h>o.h)return 1;
			else if(this.h<o.h)return -1;
			return 0;
		}
	}
	
}