import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	static int[][] side_wall;
	static int[][] under_wall;
	static int[][] flag;
	static int[][] map;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			w = scan.nextInt();
			h = scan.nextInt();
			if (w==0 && h==0) break;
			side_wall = new int[h][w];
			under_wall = new int[h][w];
			for(int j=0;j<h;++j){
				for(int i=0;i<w-1;++i){
					side_wall[j][i]=scan.nextInt();
				}
				side_wall[j][w-1]=1;
				if(j==h-1){
					for(int i=0;i<w-1;++i){
						under_wall[j][i]=1;
					}
					under_wall[j][w-1]=0;
				} else {
					for(int i=0;i<w;++i){
						under_wall[j][i]=scan.nextInt();
					}
				}
			}
			map = new int[h][w];
			Queue<Node> qu = new LinkedList();
			Node node = new Node(0,0);
			qu.add(node);
			map[0][0]=1;
			while(qu.isEmpty()!=true){
				Node cur = qu.poll();
				int x=cur.getx(),y=cur.gety();
				if(x==w-1&&y==h-1){
					break;
				}
				if(y-1>=0){
					if(under_wall[y-1][x]==0&&map[y-1][x]==0){
						qu.add(new Node(x,y-1));
						map[y-1][x]=map[y][x]+1;
					}
				}
				if(x-1>=0){
					if(side_wall[y][x-1]==0&&map[y][x-1]==0){
						qu.add(new Node(x-1,y));
						map[y][x-1]=map[y][x]+1;
					}
				}
				if(x+1<w){
					if(side_wall[y][x]==0&&map[y][x+1]==0){
						qu.add(new Node(x+1,y));
						map[y][x+1]=map[y][x]+1;
					}
				}
				if(y+1<h){
					if(under_wall[y][x]==0&&map[y+1][x]==0){
						qu.add(new Node(x,y+1));
						map[y+1][x]=map[y][x]+1;
					}
				}
			}
			System.out.println(map[h-1][w-1]);
		}
	}
}

class Node{
	private int x;
	private int y;
	Node(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}
}

