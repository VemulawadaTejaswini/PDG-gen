import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int w,h,ax,ay,bx,by;
	static int[][] field,already;
	static int[] v1={1,0,-1,0};
	static int[] v2={0,-1,0,1};
	static int[] vv1={0,0,1,0,0,0,0,0,-1};
	static int[] vv2={0,0,0,0,-1,0,1,0,0};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			h=cin.nextInt();
			w=cin.nextInt();
			field=new int[h][w];
			already=new int[h][w];
			if(h+w==0)break;
			Queue<int[]> q=new LinkedList<int[]>();
			for(int i=0;i<h;i++){
				String s=cin.next();
				for(int j=0;j<w;j++){
					if(s.charAt(j)=='.'){
						field[i][j]=-1;
					}
					else if(s.charAt(j)=='#'){
						field[i][j]=1000;
					}
					else if(s.charAt(j)=='A'){
						ax=i;
						ay=j;
						field[i][j]=-1;
						q.add(new int[]{ax,ay});
					}
					else if(s.charAt(j)=='B'){
						field[i][j]=-1;
						bx=i;
						by=j;
					}
				}
			}
			String pat=cin.next();
			int cnt=-1;
			while(!q.isEmpty()){
				int size=q.size();
				cnt++;
				for(int sss=0;sss<size;sss++){
					int[] a=q.poll();
					int x=a[0];
					int y=a[1];
					field[x][y]=cnt;
					for(int i=0;i<4;i++){
						int xx=x+v1[i];
						int yy=y+v2[i];
						if(xx<0||xx>=h||yy<0||yy>=w||field[xx][yy]!=-1)continue;
						field[xx][yy]=cnt+1;
						q.add(new int[]{xx,yy});
					}
					
				}
			}cnt=0;
//			output();
			int nowx=bx,nowy=by,ans=10000,ansx=-1,ansy=-1;
			while(true){
				int p=pat.charAt(cnt%pat.length())-'0';
				nowx+=vv1[p];
				nowy+=vv2[p];
				if(nowx<0)nowx=0;
				if(nowy<0)nowy=0;
				if(nowx>=h)nowx=h-1;
				if(nowy>=w)nowy=w-1;
				cnt++;
				if(field[nowx][nowy]!=-1&&field[nowx][nowy]<=cnt){
//					ans=Math.min(ans, cnt);
					if(ans>cnt){
						ans=cnt;
						ansx=nowx;
						ansy=nowy;
					}
				}
				int x=cnt%pat.length();
				if((already[nowx][nowy]>>x)%2==1){
					if(cnt>=h*w)
					break;
				}
				already[nowx][nowy]=already[nowx][nowy]|(1<<x);
			}
			if(ans==10000){
				System.out.println("impossible");
			}
			else{
				System.out.println(ans+" "+ansx+" "+ansy);
			}
		}
	}
	static void output(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
	}
}