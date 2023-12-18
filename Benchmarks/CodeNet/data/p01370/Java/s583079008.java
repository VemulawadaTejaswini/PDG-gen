
import java.util.*;
import java.io.*;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out  = new PrintWriter(System.out);
		int[][] d = {{0,1},{1,1},{1,0},{0,-1},{-1,-1},{-1,0}};
		boolean[][] map = new boolean[70][70];
		ArrayList<Point> list1 = new ArrayList<Point>();
		ArrayList<Point> list2 = new ArrayList<Point>();
		while(true){
			list1.clear();
			list2.clear();
			int t = Integer.parseInt(stdIn.next());
			int n = Integer.parseInt(stdIn.next()); 
			if(t==0 && n==0){
				break;
			}
			for(int i=0;i<70;i++){
				Arrays.fill(map[i],true);
			}
			for(int i=0;i<n;i++){
				int x = Integer.parseInt(stdIn.next());
				int y = Integer.parseInt(stdIn.next());
				map[x+35][y+35] = false;
			}
			
			int now_x = Integer.parseInt(stdIn.next());
			int now_y = Integer.parseInt(stdIn.next());
			Point now = new Point(now_x+35,now_y+35);
			map[now_x+35][now_y+35] = false;
			list1.add(now);
			int count = 1;
			while(t>0){
				for(int i=0;i<list1.size();i++){
					now = list1.get(i);
					for(int j=0;j<d.length;j++){
						if(map[now.x+d[j][0]][now.y+d[j][1]]){
							map[now.x+d[j][0]][now.y+d[j][1]] = false;
							count++;
							Point p = new Point(now.x+d[j][0],now.y+d[j][1]);
							list2.add(p);
						}
					}
				}
				list1.clear();
				for(int k=0;k<list2.size();k++){
					list1.add(list2.get(k));
				}
				list2.clear();
				t--;
			}
			out.println(count);
			out.flush();
		}
	}

}

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}