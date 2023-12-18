import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int w,h;
	static int[][] field;
	static int[] v1={1,0,-1,0};
	static int[] v2={0,-1,0,1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:while(true){
			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0)break;
			field=new int[h][w];
			Queue<int[]> q=new LinkedList<int[]>();
			for(int i=0;i<h;i++){
				char[] s=cin.next().toCharArray();
				for(int j=0;j<w;j++){
					if(s[j]=='.'){
						field[i][j]=-1;	
					}
					else if(s[j]=='&'){
						field[i][j]=-1;
						q.add(new int[]{i,j});
					}
					else if(s[j]=='#'){
						field[i][j]=-2;
					}
				}
			}
			while(!q.isEmpty()){
				int[] a=q.poll();
				int x=a[0];
				int y=a[1];
				for(int i=0;i<4;i++){
					int xx=x+v1[i];
					int yy=y+v2[i];
					if(xx<0||xx>=h||yy<0||yy>=w){
						System.out.println(0);
						continue label;
					}
					if(field[xx][yy]==-1){
						field[xx][yy]=0;
						q.add(new int[]{xx,yy});
					}
				}
			}
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
//					System.out.print(field[i][j]+" ");
				}
//				System.out.println();
			}
			for(int cnt=0;;cnt++){
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(field[i][j]==cnt){
							q.add(new int[]{i,j});
							if(a(q,cnt)){
								System.out.println(cnt+1);
								continue label;
							}
							q=new LinkedList<int[]>();
						}
					}
				}
			}
		}
	}
	static boolean a(Queue<int[]> q,int cnt){
		while(!q.isEmpty()){
			int[] a=q.poll();
			int x=a[0];
			int y=a[1];
			if(field[x][y]==-1){
				field[x][y]=cnt+1;
			}
			for(int i=0;i<4;i++){
				int xx=x+v1[i];
				int yy=y+v2[i];
				if(xx<0||xx>=h||yy<0||yy>=w){
					return true;
				}
				if(field[xx][yy]==cnt){
					continue;
				}
				if(field[xx][yy]==-1){
					field[xx][yy]=cnt+1;
					q.add(new int[]{xx,yy});
				}
				if(field[xx][yy]==-2&&field[x][y]==cnt){
					xx=x+v1[i];
					yy=y+v2[i];
					if(xx<0||xx>=h||yy<0||yy>=w){
						return true;
					}
					field[xx][yy]=cnt+1;
					q.add(new int[]{xx,yy});
				}
			}
		}
		
		return false;
	}
}