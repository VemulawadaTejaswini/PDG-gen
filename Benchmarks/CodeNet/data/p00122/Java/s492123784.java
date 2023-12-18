import java.util.Scanner;

public class Main {
	
	static int[] x, y;
	static int n;
	static int[] dx= {-2, -2, -2, -1, 0, 1, 2, 2, 2, 1, 0, -1};
	static int[] dy= {-1, 0, 1, 2, 2, 2, 1, 0, -1, -2, -2, -2};
	
	static boolean dfs(int nowx,int nowy,int count) {
		if(count==n+1) return true;
		for(int i=0; i<12; i++) {
			if(nowx+dx[i]<0 || nowx+dx[i]>=10 || nowy+dy[i]<0 || nowy+dy[i]>=10) {
				continue;
			}
			if(nowx+dx[i]>=x[count]-1 && nowx+dx[i]<=x[count]+1 && nowy+dy[i]>=y[count]-1 && nowy+dy[i]<=y[count]+1) {
				if(dfs(nowx+dx[i], nowy+dy[i], count+1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int px=sc.nextInt();
				int py=sc.nextInt();
				if(px+py==0) break;
				n=sc.nextInt();
				x=new int[n+1];
				y=new int[n+1];
				for(int i=1; i<=n; i++) {
					x[i]=sc.nextInt();
					y[i]=sc.nextInt();
				}
				if(dfs(px, py, 1)) System.out.println("OK");
				else System.out.println("NA");
				
			}
		
			
			
		}

	}
}
