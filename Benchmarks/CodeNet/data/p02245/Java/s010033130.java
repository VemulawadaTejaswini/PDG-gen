import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<Puzzle> queue=new LinkedList<Puzzle>();
	static Map<String, Integer> map=new HashMap<>();
	static int[][] goal;
	
	static class Puzzle{
		int[][] p=new int[4][4];
		int step;
		Puzzle(int[][] p, int step){
			this.step=step;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					this.p[i][j]=p[i][j];
				}
			}
		}
	}
	
	static int bfs() {
		int minstep=0;
		int[][] dt={{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
		while(! queue.isEmpty()) {
			int[][] field=new int[4][4];
			String str="";
			int r=0, c=0;
			Puzzle q=queue.remove();
			boolean tf=true;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					field[i][j]=q.p[i][j];
					str+=String.valueOf(field[i][j]);
					if(q.p[i][j]==0) {
						r=i;
						c=j;
					}
					if(q.p[i][j]!=goal[i][j]) {
						tf=false;
					}
				}
			}
			minstep=q.step;
			if(tf) {
				break;
			}
			if(map.get(str)!=null) {
				continue;
			}
			map.put(str, minstep);
			
			for(int i=0; i<4; i++) {
				if(r+dt[i][0]>2 || r+dt[i][0]<0 || c+dt[i][1]>2 || c+dt[i][1]<0){
		            continue;
		        }
				int swap=field[r][c];
				field[r][c]=field[r+dt[i][0]][c+dt[i][1]];
				field[r+dt[i][0]][c+dt[i][1]]=swap;
				queue.add(new Puzzle(field, minstep+1));
				swap=field[r][c];
				field[r][c]=field[r+dt[i][0]][c+dt[i][1]];
				field[r+dt[i][0]][c+dt[i][1]]=swap;
			}
			
		}
		return minstep;
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			goal=new int[4][4];
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					goal[i][j]=sc.nextInt();
				}
			}
			int[][] start=new int[4][4];
			int count=1;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					start[i][j]=count%9;
					count++;
				}
			}
			queue.add(new Puzzle(start, 0));
			System.out.println(bfs());

		}
	}
}
