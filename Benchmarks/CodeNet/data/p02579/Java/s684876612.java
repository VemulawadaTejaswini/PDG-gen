import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	int n;
	int m;
	int c=0;
	int dp[][];
	char s[][];
	int dx[]= {1,0,-1,0};
	int dy[]= {0,1,0,-1};
	static int INF=1_000_000_000;
	
	@SuppressWarnings("unchecked")
	//Main
	void main() {
		
		n=inp.nextInt();
		m=inp.nextInt();
		int x1=inp.nextInt()-1;
		int y1=inp.nextInt()-1;
		int x2=inp.nextInt()-1;
		int y2=inp.nextInt()-1;
		s=new char[n][m];
		dp=new int[n][m];
		for(int i=0;i<n;i++) {
			Arrays.fill(dp[i], INF);
		}
		
		for(int i=0;i<n;i++) {
			char a[]=inp.next().toCharArray();
			for(int j=0;j<m;j++) {
				s[i][j]=a[j];
			}
		}
		ArrayDeque<Integer> xs = new ArrayDeque<Integer>();
		ArrayDeque<Integer> ys = new ArrayDeque<Integer>();
		xs.add(x1);
		ys.add(y1);
		dp[x1][y1]=0;
		while(!xs.isEmpty()) {
			int x=xs.pop();
			int y=ys.pop();
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(isValid(nx,ny)) {
					if(dp[nx][ny]>dp[x][y]) {
						dp[nx][ny]=dp[x][y];
						xs.add(nx);
						ys.add(ny);
					}
				}
			}
			for(int nx=x-2;nx<=x+2;nx++) {
				for(int ny=y-2;ny<=y+2;ny++) {
					if(isValid(nx,ny)) {
						if(dp[nx][ny]>dp[x][y]+1) {
							dp[nx][ny]=dp[x][y]+1;
							xs.addLast(nx);
							ys.addLast(ny);
						}
					}
				}
			}
		}
		System.out.println(dp[x2][y2]==INF?-1:dp[x2][y2]);
	}
    
    
    
    boolean isValid(int i, int j) {
    	return i>=0 && i<n && j>=0 && j<m && s[i][j]=='.';
    }
		
}
