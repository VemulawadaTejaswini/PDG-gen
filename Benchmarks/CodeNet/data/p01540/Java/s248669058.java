import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	//1700 cording start
	//1803 sample matched
	boolean isfind;
	
	private void doit(){
		InStream sc = new InStream();
		//while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] xlist = new int[n];
			int [] ylist = new int[n];
			ArrayList<Integer> xl = new ArrayList<Integer>();
			ArrayList<Integer> yl = new ArrayList<Integer>();
			for(int i = 0 ; i < n; i++){
				xlist[i] = sc.nextInt();
				ylist[i] = sc.nextInt();
				xl.add(xlist[i]);
				yl.add(ylist[i]);
			}
			
			Collections.sort(yl);
			Collections.sort(xl);
			
			for(int i = 1; i < xl.size(); i++){
				if(xl.get(i-1) == xl.get(i)){
					xl.remove(i);
					i--;
				}
			}
			for(int i = 1; i < yl.size(); i++){
				if(yl.get(i-1) == yl.get(i)){
					yl.remove(i);
					i--;
				}
			}
			
			int [][] acc = new int[yl.size() + 1][xl.size()+1];
			for(int k = 0 ; k < n; k++){
				int x = Collections.binarySearch(xl, xlist[k]) + 1;
				int y = Collections.binarySearch(yl, ylist[k]) + 1;
				for(int i = y; i < acc.length; i++){
					for(int j = x; j < acc[i].length; j++){
						acc[i][j]++;
					}
				}
			}
			
			//debug
//			System.out.println(Arrays.toString(ysorted));
//			System.out.println(Arrays.toString(xsorted));
//			System.out.println(yl.size() + " " + xl.size());
//			for(int i = 0 ; i < acc.length; i++){
//				System.out.print("i = " + i);
//				for(int j = 0; j < acc[i].length; j++){
//					System.out.print(acc[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			//query
			for(int i = 0 ; i < m; i++){
				int minx = sc.nextInt();
				int miny = sc.nextInt();
				int maxx = sc.nextInt();
				int maxy = sc.nextInt();
				
				int x1,y1,x2,y2;
				x1 = bs(xl, minx);
				y1 = bs(yl, miny);
				
				isfind = false;
				x2 = bs(xl, maxx);
				if(isfind) x2++;
				isfind = false;
				y2 = bs(yl, maxy);
				if(isfind) y2++;
				
				//System.out.println("x1 = " + x1 + "y1 = " + y1 + "x2 = " + x2 +" y2 = " + y2);
				
				int res = acc[y2][x2] + acc[y1][x1] - acc[y2][x1] - acc[y1][x2];
				System.out.println(res);
			}
		//}
		
	}


	private int bs(ArrayList<Integer>a, int x) {
		int mid, left = 0, right = a.size() -1;
		while(left <= right){
			mid = (left + right) / 2;
			if(a.get(mid) == x){
				isfind = true;
				return mid;
			}
			if(a.get(mid) < x){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return left;
	}
	
	class InStream{
		BufferedReader in;
		StringTokenizer st;
		public InStream() {
			this.in = new BufferedReader(new InputStreamReader(System.in));
			this.st = null;
		}
		
		String next() {
			while (st==null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken(); 
		}
		
		boolean hasNext(){
			try {
				st = new StringTokenizer(in.readLine());
				return true;
			} catch (Exception e) {return false;}
		}

		int nextInt() {
			return Integer.parseInt(next()); 
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}


	public static void main(String [] args){
		new Main().doit();
	}
}