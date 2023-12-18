import java.util.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	int N,M;
	final int	MAX1=1000001,
				MAX2=1001,
				INF=1<<29;
	boolean[][] isPrime;
	int[][] number,dp1,dp2;
	int[] xp,yp;
	void init(){
		isPrime = new boolean[MAX2][MAX2];
		number = new int[MAX2][MAX2];
		for(int i=0; i<MAX2; ++i)for(int j=0; j<MAX2; ++j)	number[i][j]=INF;
		xp=new int[MAX1];
		yp=new int[MAX1];
		int x=500,y=500;
		int lim=1,cnt=0,two=0,v=0;
		final int[] vx={1,0,-1,0},vy={0,-1,0,1};
		for(int i=1; i<MAX1; ++i){
//			System.out.println(i+"="+x+","+y);
			xp[i]=x;	yp[i]=y;
			number[x][y]=i;
			x+=vx[v];	y+=vy[v];
			++cnt;
			if(cnt>=lim){
				cnt=0;
				v=(v+1)%4;
				++two;
				if(two>=2){
					two=0;
					++lim;
				}
			}
		}
		dp1=new int[MAX2][MAX2];
		dp2=new int[MAX2][MAX2];
		
		for(int i=0; i<MAX2; ++i)for(int j=0; j<MAX2; ++j)	isPrime[i][j]=true;
		isPrime[xp[0]][yp[0]]=isPrime[xp[1]][yp[1]]=false;
		for(int i=2; i*i<MAX1; ++i)if(isPrime[xp[i]][yp[i]])for(int j=i+i; j<MAX1; j+=i)	isPrime[xp[j]][yp[j]]=false;
		
		while(true){
			M=sc.nextInt();
			N=sc.nextInt();
			if((N|M)==0)	break;
			solve();
		}
	}

	void solve(){
		int sx=xp[N],sy=yp[N];
		for(int x=0; x<MAX2; ++x)for(int y=sy; y<MAX2; ++y){
			dp1[x][y]=-INF;
			dp2[x][y]=0;
		}
		
		dp1[sx][sy]=(isPrime[sx][sy]? 1: 0);
		dp2[sx][sy]=(isPrime[sx][sy]? number[sx][sy]: 0);
		int ans1=(isPrime[sx][sy]? 1: 0),ans2=(isPrime[sx][sy]? number[sx][sy]: 0);
		
		for(int y=sy; y<MAX2-1; ++y)for(int x=0; x<MAX2; ++x)if(number[x][y]<=M && dp1[x][y]>(-INF)){
//			System.out.println(x+","+y+" "+number[x][y]+" "+isPrime[x][y]+" "+dp1[x][y]);
			for(int i=-1; i<=1; ++i){
				int nx=x+i,ny=y+1;
				if(!(0<=nx&&nx<MAX2 && 0<=ny&&ny<MAX2))	continue;
				if(number[nx][ny]>M)	continue;
				if(dp1[nx][ny] < dp1[x][y]+(isPrime[nx][ny]? 1: 0)){
					dp1[nx][ny]=dp1[x][y]+(isPrime[nx][ny]? 1: 0);
					dp2[nx][ny]=(isPrime[nx][ny]? number[nx][ny]: dp2[x][y]);
					// TODO
//					System.out.println(nx+","+ny+" "+number[nx][ny]+" "+isPrime[nx][ny]+" "+dp1[nx][ny]);
				}else if(dp1[nx][ny] == dp1[x][y]+(isPrime[nx][ny]? 1: 0)){
					if(dp2[nx][ny] < (isPrime[nx][ny]? number[nx][ny]: dp2[x][y])){
						dp1[nx][ny]=dp1[x][y]+(isPrime[nx][ny]? 1: 0);
						dp2[nx][ny]=(isPrime[nx][ny]? number[nx][ny]: dp2[x][y]);
						// TODO
//						System.out.println(nx+","+ny+" "+number[nx][ny]+" "+isPrime[nx][ny]+" "+dp1[nx][ny]);
					}
				}
				if(ans1 < dp1[nx][ny]){
					ans1=dp1[nx][ny];
					ans2=dp2[nx][ny];
				}else if(ans1==dp1[nx][ny] && ans2<dp2[nx][ny]){
					ans2=dp2[nx][ny];
				}
			}
		}
		System.out.println(ans1+" "+ans2);		
	}
}