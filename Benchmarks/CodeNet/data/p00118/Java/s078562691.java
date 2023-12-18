import java.math.*;
import java.util.*;
  
  

public class Main {

	static int n,m;
	static String map[];
	static boolean flag[][];
	static class pair{
		int x,y;
		pair(int a ,int b){
			this.x=a;
			this.y=b;
			}
	}
	static int dx[]= {-1,0,1,0},dy[]= {0,-1,0,1};
	public static void main(String[] args) {
          
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	n=scan.nextInt();
	        m=scan.nextInt();
	        scan.nextLine();
	        if(n==0&&m==0)break;
	        map=new String [n];
	        for(int i=0;i<n;i++) {
	        	map[i]=scan.nextLine();
	        }
	        Stack<pair> stemp=new Stack<Main.pair>();
	        stemp.add(new pair(0,0));
	        flag=new boolean[n][m];
	        int res=dfs(stemp);
	        System.out.println(res);
        }
        
        
        
        
	}
	private static int dfs(Stack<pair> s) {
		int cnt=0;
		for(int w=0;w<n;w++) {
			for(int k=0;k<m;k++) {
				if(!flag[w][k]) {
					s.add(new pair(w,k));
					while(!s.isEmpty()) {
						pair p=s.peek();
						s.pop();
						for(int i=0;i<4;i++) {
							int nx=p.x+dx[i],ny=p.y+dy[i];
							char nc=map[p.x].charAt(p.y);
							if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx].charAt(ny)==nc&&flag[nx][ny]==false) {
								s.add(new pair(nx,ny));
								flag[nx][ny]=true;
							}
						}
					}
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	
	
	
}
