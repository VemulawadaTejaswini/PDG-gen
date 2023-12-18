import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1020().doIt();
	}

	class AOJ1020{
		int[][][] memo;
		HashMap<Character,Point> map;
		int[] sx = {1,0,-1,0};
		int[] sy = {0,1,0,-1};
		int n;
		Point bad,goal;
		int dfs(int x,int y,int battery){
			if(memo[x][y][battery]>0)return memo[x][y][battery];
			if(battery==n){
				if(goal.x==x&&goal.y==y)return 1;
				else return 0;
			}
			int result = 0;
			for(int i=0;i<4;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>=3||ny<0||ny>=3||(bad.x==nx&&bad.y==ny))result += dfs(x,y,battery+1);
				else result +=  dfs(nx,ny,battery+1);
			}
			return memo[x][y][battery] = result;
		}


		void doIt(){
			map = new HashMap<Character,Point>();
			map.put('A',new Point(0, 0));
			map.put('B',new Point(1, 0));
			map.put('C',new Point(2, 0));
			map.put('D',new Point(0, 1));
			map.put('E',new Point(1, 1));
			map.put('F',new Point(2, 1));
			map.put('G',new Point(0, 2));
			map.put('H',new Point(1, 2));
			map.put('I',new Point(2, 2));
			while(true){
				n = in.nextInt();
				if(n==0)break;
				char s = in.next().charAt(0);
				char g = in.next().charAt(0);
				char b = in.next().charAt(0);
				memo = new int[3][3][n+1];
				bad = new Point(map.get(b).x, map.get(b).y);
				goal = new Point(map.get(g).x,map.get(g).y);
				double a = dfs(map.get(s).x,map.get(s).y,0);
				long c = 4;
				for(int i=0;i<n-1;i++)c*=4;
//				System.out.println(a+" "+c);
				System.out.printf("%.9f\n",(a/c));
				
				
			}
		}
		class Point{
			int x,y;
			public Point(int x,int y) {
				this.x = x;
				this.y = y;
			}
		}

	}


}