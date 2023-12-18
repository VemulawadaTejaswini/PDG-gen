import java.util.*;

class Main{
	static int a,b;
	static int ans=0;
	static int[][] takeshi;
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		while(true){
			b=s.nextInt();
			a=s.nextInt();
			if(a==0)System.exit(0);
			takeshi=new int[a][b];
			String now;
			int p=0,q=0;
			for(int i=0;i<a;i++){
				now=s.next();
				for(int j=0;j<b;j++){
					if(now.charAt(j)=='#')takeshi[i][j]=0;
					else if(now.charAt(j)=='.')takeshi[i][j]=1;
					else{
						takeshi[i][j]=0;
						p=i;
						q=j;
					}
				}
			}
			
			
			System.out.println(solve(p,q));
		}
	}
	static int solve(int m,int n){
		int ret=0;
		
		takeshi[m][n]=0;
		
		if(m>0)
			if(takeshi[m-1][n]==1)ret+=solve(m-1,n);
		if(m<a-1)
			if(takeshi[m+1][n]==1)ret+=solve(m+1,n);
		if(n>0)
			if(takeshi[m][n-1]==1)ret+=solve(m,n-1);
		if(n<b-1)
			if(takeshi[m][n+1]==1)ret+=solve(m,n+1);
		
		
		return ret+1;
	}
}