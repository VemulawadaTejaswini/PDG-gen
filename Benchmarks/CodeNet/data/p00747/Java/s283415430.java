import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int w = cin.nextInt();
			int h = cin.nextInt();
			if(w+h==0){
				break;
			}
			Room[][] r= new Room[h][w];
			boolean[][] a = new boolean[h*2-1][w];
			for(int i = 0; i < h*2-1;i++){
				for(int j = 0;j < w;j++){
					if(i%2==0){
						if(w-1==j){
							break;
						}
					}
					int c = cin.nextInt();
					a[i][j]=c==1;
				}
			}
			for(int i = 1; i < h-1; i++){
				for(int j = 1;j  < w-1;j++){
					r[i][j]=new Room(a[i*2-1][j],
							a[i*2+1][j],
							a[i*2][j-1],
							a[i*2][j]);
				}
			}
			
			r[0][0] = new Room(true, a[1][0],true, a[0][0]);
			r[0][w-1] = new Room(true, a[1][w-1], a[0][w-1], true);
			r[h-1][0] = new Room(a[h*2-2][0],true,true,a[h*2-2][0]);
			r[h-1][w-1]=new Room(a[h*2-2][0],true,a[h*2-2][w-1],true);
			for(int i = 1; i < w-1;i++){
				r[0][i]=new Room(true, a[1][i],a[0][i-1],a[0][i]);
				r[h-1][i]=new Room(a[h*2-3][i],true,a[h*2-2][i-1],a[h*2-2][i]);
			}
			for(int i = 1; i < h-1;i++){
				r[i][0]=new Room(a[i*2-1][0],a[i*2+1][0],true,a[i*2][0]);
				r[i][w-1]=new Room(a[i*2-1][w-1],a[i*2+1][w-1],a[i*2][w-1],true);
			}
			Queue<Integer[]> q = new LinkedList<Integer[]>();
			Integer[] pair = {0,0};
			int[][] saitan = new int[h][w];
			for(int i = 0; i < h;i++){
				for(int j = 0; j < w;j++){
					saitan[i][j]=1000000;
				}
			}
			//System.out.println(r[1][1].a());
			saitan[0][0]=1;
			q.add(pair);
			while(!q.isEmpty()){
				Integer[] p = q.poll();
				int x = p[0];
				int y = p[1];
				//System.out.println(x+ " " +y);
				if(x-1>0){
					if(!r[x][y].top&&saitan[x-1][y]>saitan[x][y]+1){
						Integer[] next={x-1,y};
						q.add(next);
						saitan[x-1][y]=saitan[x][y]+1;
					}
				}
				if(y-1>0){
					if(!r[x][y].left&&saitan[x][y-1]>saitan[x][y]+1){
						Integer[] next={x,y-1};
						q.add(next);
						saitan[x][y-1]=saitan[x][y]+1;
					}
				}
				if(x+1<h){
					if(!r[x][y].bottom&&saitan[x+1][y]>saitan[x][y]+1){
						Integer[] next={x+1,y};
						q.add(next);
						saitan[x+1][y]=saitan[x][y]+1;
					}
				}
				if(y+1<w){
					if(!r[x][y].right&&saitan[x][y+1]>saitan[x][y]+1){
						Integer[] next={x,y+1};
						q.add(next);
						saitan[x][y+1]=saitan[x][y]+1;
					}
				}
			}
			/*
			for(int i = 0; i < h;i++){
				for(int j = 0;j < w;j++){
					System.out.print(saitan[i][j] + " ");		
				}
				System.out.println();
			}*/
			if(saitan[h-1][w-1]==1000000){
				System.out.println(0);
			}
			else{
				System.out.println(saitan[h-1][w-1]);
			}
			
		}
	}
}
class Room{
	boolean top;
	boolean bottom;
	boolean left;
	boolean right;
	Room(boolean a,
			boolean b,
			boolean c,
			boolean d){
		top = a;
		bottom =b;
		left = c;
		right = d;
	}
	String a(){
		return (top + " " + bottom+" "+left+" "+right);
	}
}