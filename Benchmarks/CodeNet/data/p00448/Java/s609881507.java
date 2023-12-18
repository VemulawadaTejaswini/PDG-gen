import java.math.*;
import java.util.*;
  
  

public class Main {
	
	static int map[][],n,m,res;
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	n=scan.nextInt();
        	m=scan.nextInt();
        	map=new int[n][m];
	        if(n==0&&m==0)break;
        	for(int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++)map[i][j]=scan.nextInt();
	        }
        	res=0;
        	dfs(0);
	        System.out.println(res);
        }
        
        
        
	}
	static void dfs(int d) {
		if(d==n) {
			
			res=Math.max(res, row());
			return;
		}
		line(d);
		dfs(d+1);
		line(d);
		dfs(d+1);
		
	}
	static void line(int d) {
		for(int i=0;i<m;i++) {
			map[d][i]=map[d][i]^1;
		}
	}
	static int row() {
		int sum=0;
		for(int i=0;i<m;i++) {
			int cnt=0;
			for(int j=0;j<n;j++) {
				cnt+=map[j][i];
			}
			sum+=Math.max(cnt, n-cnt);
		}
		return sum;
	}
	
}
