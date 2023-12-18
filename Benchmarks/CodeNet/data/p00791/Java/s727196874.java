import java.io.*;
import java.util.*;

public class Main{
	//1036 start
	//1150 sample matched
	HashMap<Integer, Integer> areaList;
	P topleft, topright, bottomleft, bottomright;
	char [][] input;
	int [] vx = {0,1,1,1,0,-1,-1,-1};
	int [] vy = {1,1,0,-1,-1,-1,0,1};
	int n , xlen;
	
	//class
	class P{
		int x, y;
		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	class C implements Comparable<C>{
		int area, count;

		public C(int area, int count) {
			this.area = area;
			this.count = count;
		}

		@Override
		public String toString() {
			return this.area + " " + this.count;
		}
		
		public int compareTo(C o){
			if(this.area < o.area) return -1;
			if(this.area > o.area) return 1;
			return 0;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			if(! flg){
				flg = true;
			}
			else{
				System.out.println("----------");
			}
			sc.nextLine();
			input = new char[n][];
			for(int i = 0; i < n; i++){
				input[i] = sc.nextLine().toCharArray();
				//System.out.println(Arrays.toString(input[i]));
			}
			xlen = input[0].length;
			
			areaList = new HashMap<Integer, Integer>();
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < input[i].length; j++){
					if(input[i][j] == '*'){
						topleft = new P(j,i);
						topright = new P(j,i);
						bottomleft = new P(j,i);
						bottomright = new P(j,i);
						dfs(i,j);

						int res = getArea();
						if(areaList.containsKey(res)){
							areaList.put(res, areaList.get(res) + 1);
						}
						else{
							areaList.put(res, 1);
						}
					}
				}
			}
			
//			//debug
//			System.out.println("debug = " );
//			for(int ii = 0;ii < n ;ii++){
//				System.out.println(Arrays.toString(input[ii]));
//			}

			
			//print
			ArrayList<C> list = new ArrayList<C>();
			for(int key: areaList.keySet()){
				list.add(new C(key, areaList.get(key)));
			}
			
			Collections.sort(list);
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
			}
		}
	}

	private void dfs(int y, int x) {
		input[y][x] = ' ';
		
		if(y == bottomright.y){
			if(x < bottomleft.x){
				bottomleft.x = x;
			}
			else if(x > bottomright.x){
				bottomright.x = x;
			}
		}
		if(y > bottomright.y){
			bottomright.y = y;
			bottomleft.y = y;
			bottomleft.x = x;
			bottomright.x = x;
		}
		
		if(y == topright.y){
			if(x > topright.x){
				topright.x = x;
			}
		}
		
		for(int i = 0; i < vx.length; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(yy,xx)) continue;
			if(input[yy][xx] == '*'){
				dfs(yy,xx);
			}
		}
		
	}

	private boolean isOK(int y, int x) {
		if(0 <= y && y < n && 0 <= x && x < input[y].length) return true;
		return false;
	}

	private int getArea() {
		
		int top = topright.x - topleft.x + 1;
		int bottom = bottomright.x - bottomleft.x + 1;
		int height = bottomright.y - topright.y + 1;
//		System.out.println(topleft.x + "x= " + topright.x + "top= " + top + " bottom = " + bottom + " height = " + height);
//		System.out.println(bottomleft.x + " " + bottomright.x);
		return (top + bottom) * height / 2;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}