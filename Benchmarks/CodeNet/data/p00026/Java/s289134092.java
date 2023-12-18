import java.util.*;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	int[][] map;
	int h = 10;
	int w = 10;
	int[] a = {1, 0, -1, 0, 1, -1, 1, -1, 2, 0, -2, 0};
	int[] b = {0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
	int count;
	int max;
	void run(){
		map = new int[h][w];
		max = 0;
		count = h*w;
		while(sc.hasNext()){
			String[] i = sc.next().split(",");
			int x = Integer.parseInt(i[0]);
			int y = Integer.parseInt(i[1]);
			int s = Integer.parseInt(i[2]);
			drop(x, y, s);
		}
		System.out.println(count+"\n"+max);
	}
	void drop(int x, int y, int s){
		ink(x, y);
		for(int i=0; i<s*4; i++)
			ink(x+a[i], y+b[i]);
		}
	void ink(int x, int y){
		if(x>=0 && y>=0 && x<10 && y<10){
			map[x][y]++;
			if(max < map[x][y]) max = map[x][y];
			if(map[x][y]==1) count--;
		}
	}
}