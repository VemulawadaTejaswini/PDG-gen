import java.util.*;
import java.io.*;

public class Main{

static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split("\\s+");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split("\\s+");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
static int Modpow(int a,int p,int m){int res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
//......................................@uthor_Alx..............................................
static long mod=(long)1e9+7;
static int f(int[] a, int[] b){
	return a[2]-b[2];
}
static int disj(char[][] g, int sx, int sy,int ex,int ey,int h,int w)  throws  IOException {
	PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->f(a,b));
	pq.add(new int[]{sx,sy,0});
	boolean[][] b=new boolean[h][w];
	int[][] c=new int[h][w]; int inf=800000000;
	int[] dx=new int[]{1,-1,0,0};
	int[] dy=new int[]{0,0,1,-1};
	for(int i=0;i<h;i++){Arrays.fill(c[i],inf);}
	c[sx][sy]=0;
	while(!pq.isEmpty()){
		int[] p=pq.poll();
		if(p[0]==ex&&p[1]==ey) return p[2];
		if(b[p[0]][p[1]]) continue;
		b[p[0]][p[1]]=true;
		//out.write(p[0]+" "+p[1]+" "+p[2]+"\n");
			for(int i=0;i<4;i++){
			int nx=p[0]+dx[i],ny=p[1]+dy[i],cc=p[2];
			if(nx<0||nx>=h||ny<0||ny>=w||b[nx][ny]||g[nx][ny]=='#') continue;
			if(c[nx][ny]>cc){
				c[nx][ny]=cc;
				pq.add(new int[]{nx,ny,cc});
			}
		}
		for(int i=Math.max(0,p[0]-2);i<=Math.min(h-1,p[0]+2);i++){
			for(int j=Math.max(0,p[1]-2);j<=Math.min(w-1,p[1]+2);j++){
				if(i==p[0]&&j==p[1]) continue;
				if(b[i][j]||g[i][j]=='#') continue;
				if(c[i][j]>p[2]+1){
					c[i][j]=p[2]+1;
					pq.add(new int[]{i,j,p[2]+1});
				}
			}
		}
	}
	return -1;
}
public static void main(String[] args) throws  IOException{
                assign();
                int[] x=int_arr(),x1=int_arr(),x2=int_arr();
                int h=x[0],w=x[1],sx=x1[0],sy=x1[1],ex=x2[0],ey=x2[1];
                sx--;sy--;ex--;ey--;
                char[][] g=new char[h][w];
                for(int i=0;i<h;i++){
                	g[i]=read().toCharArray();
                }

              out.write(disj(g,sx,sy,ex,ey,h,w)+"");
                out.flush();

    }
}