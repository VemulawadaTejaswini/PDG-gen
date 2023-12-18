import java.util.*;

class Main{
	static int[][] c;
	static int a,b;
	static void delete(int m,int n){
		c[m][n]=0;
		if(m>0){
			if(n>0){
				if(c[m-1][n-1]==1)delete(m-1,n-1);
			}if(n<b-1){
				if(c[m-1][n+1]==1)delete(m-1,n+1);
			}if(c[m-1][n]==1)delete(m-1,n);
		}
		if(m<a-1){
			if(n>0){
				if(c[m+1][n-1]==1)delete(m+1,n-1);
			}if(n<b-1){
				if(c[m+1][n+1]==1)delete(m+1,n+1);
			}if(c[m+1][n]==1)delete(m+1,n);
		}
		if(n>0)if(c[m][n-1]==1)delete(m,n-1);
		if(n<b-1)if(c[m][n+1]==1)delete(m,n+1);
		return;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		while((a=s.nextInt())!=0&&(b=s.nextInt())!=0){
			c=new int[a][b];
			
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++)
				c[i][j]=s.nextInt();
			int ans=0;
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++)
					if(c[i][j]==1){
						ans++;
						delete(i,j);
						//System.out.println(i+" "+j);
					}
			
			System.out.println(ans);
		}
	}
}