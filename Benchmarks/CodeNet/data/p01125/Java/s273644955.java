import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ2000().doIt();
	}
	
	class AOJ2000{
		int n;
		Point2D target[];
		int[][] map;
		void print(){
			for(int i=0;i<21;i++){
				for(int s=0;s<21;s++)System.out.print(map[i][s]+" ");
				System.out.println();
			}
		}
		
		boolean solve(){
			map = new int[21][21];
			for(int i=0;i<21;i++)Arrays.fill(map[i],-1);
			int x = 10;int y = 10;
			int a = in.nextInt();
			int[] sx = {0,1,0,-1};int[] sy = {-1,0,1,0};
			HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
			hash.put('N',2);hash.put('E', 1);hash.put('S', 0);hash.put('W', 3);
			map[y][x] = 0;
			for(int i=0;i<a;i++){
				char h = in.next().toCharArray()[0];
				int d = in.nextInt();
				int nx = x,ny = y;
				for(int s=0;s<d;s++){
					nx+=sx[hash.get(h)];
					ny+=sy[hash.get(h)];
					map[ny][nx] = i;
				}
				x = nx;y = ny;
			}
//			print();
			for(int i=0;i<target.length;i++){
				if(map[(int)target[i].getY()][(int)target[i].getX()]<0)return false;
			}
			return true;
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				target = new Point2D[n];
				for(int i=0;i<n;i++)target[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
				boolean sw = solve();
				System.out.println(sw? "Yes":"No");
			}
		}
	}
	
}