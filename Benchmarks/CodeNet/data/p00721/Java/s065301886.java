import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int w,h,startx,starty;
	static int[][]field;
	static int[][]kyori;
	static List<int[]> list;
	static byte[] v1={1,0,-1,0};
	static byte[] v2={0,-1,0,1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:while(true){
			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0)break;
			field=new int[h+2][w+2];
			list=new ArrayList<int[]>();
			int cnt=0;
			for(int i=0;i<=h+1;i++){
				Arrays.fill(field[i], -1);
			}
			for(int i=1;i<=h;i++){
				char[] s=cin.next().toCharArray();
				for(int j=1;j<=w;j++){
					if(s[j-1]=='.'){
						field[i][j]=-2;
					}
					else if(s[j-1]=='x'){
						field[i][j]=-1;
					}
					else if(s[j-1]=='*'){
						field[i][j]=++cnt;

						list.add(new int[]{i,j});
					}
					else{
						field[i][j]=0;
						startx=i;
						starty=j;
					}
				}
			}
			for(int i=1;i<=h;i++){
				for(int j=1;j<=w;j++){
//					System.out.print(field[i][j]);
				}
//				System.out.println();
			}
			//0,0がスタート地点
			kyori=new int[cnt+1][cnt+1];
			a(startx,starty,0);
			cnt=1;
			int[][] b=new int[list.size()][2];
			for(int i=0;i<list.size();i++){
				int[] array=list.get(i);
				b[i][0]=array[0];
				b[i][1]=array[1];
			}
			list=null;
			for(int i=0;i<b.length;i++){
				a(b[i][0],b[i][1],cnt++);
			}
			for(int i=0;i<kyori[0].length;i++){
				for(int j=0;j<kyori[0].length;j++){
					if(i==j)continue;
					if(kyori[i][j]==0){
						System.out.println(-1);
						continue label;
					}
//					System.out.println(i+" "+j+" "+kyori[i][j]);
				}
			}
			sum=0;
			ans=1<<30;
			bt(0,0);
			
			System.out.println(ans);
		}
	}
	static int sum,ans;
	static void bt(int a,int step){
//		System.out.println(a+" "+step+" "+sum);
		if(ans<=sum)return;
		if(step==kyori[0].length-1){
			ans=Math.min(ans,sum);
		}
		for(int i=0;i<kyori[0].length;i++){
			if(a==i)continue;
			if(kyori[a][i]==0)continue;
			int tmp=kyori[a][i];
			kyori[a][i]=kyori[i][a]=0;
			sum+=tmp;
			bt(i,step+1);
			kyori[a][i]=kyori[i][a]=tmp;
			sum-=tmp;
		}
	}
	static void a(int x,int y,int cnt){
		int[][] f=new int[h+2][w+2];
		for(int i=0;i<h+2;i++){
			for(int j=0;j<w+2;j++){
				f[i][j]=field[i][j];
			}
		}
		Queue<byte[]> q=new LinkedList<byte[]>();
		q.add(new byte[]{(byte)x,(byte)y});
		int steps=0;
		
		while(!q.isEmpty()){
			int size=q.size();
			for(int i=0;i<size;i++){
				byte[] aaa=q.poll();
				byte xx=aaa[0];
				byte yy=aaa[1];
				if(f[xx][yy]==-1)continue;
				if(f[xx][yy]>=0){
					kyori[cnt][f[xx][yy]]=steps;kyori[f[xx][yy]][cnt]=steps;
				}
				f[xx][yy]=-1;
				for(int j=0;j<4;j++){
					byte x1=(byte) ((byte)xx+v1[j]);
					byte y1=(byte) ((byte)yy+v2[j]);
					if(f[x1][y1]==-1)continue;
					q.add(new byte[]{x1,y1});
				}				
			}
			steps++;
		}		
	}

}