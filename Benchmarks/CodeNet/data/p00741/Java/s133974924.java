import java.util.*;

class Main{
	static char[][] c;
	static int a,b;
	static void delete(int m,int n){
		c[m][n]='*';
		if(m>0){
			if(n>0){
				if(c[m-1][n-1]=='@')delete(m-1,n-1);
			}if(n<b-1){
				if(c[m-1][n+1]=='@')delete(m-1,n+1);
			}if(c[m-1][n]=='@')delete(m-1,n);
		}
		if(m<a-1){
			if(n>0){
				if(c[m+1][n-1]=='@')delete(m+1,n-1);
			}if(n<b-1){
				if(c[m+1][n+1]=='@')delete(m+1,n+1);
			}if(c[m+1][n]=='@')delete(m+1,n);
		}
		if(n>0)if(c[m][n-1]=='@')delete(m,n-1);
		if(n<b-1)if(c[m][n+1]=='@')delete(m,n+1);
		return;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		while((b=s.nextInt())!=0&&(a=s.nextInt())!=0){
			c=new char[a][b];
			
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++){
					c[i][j]=s.nextInt()==1?'@':'*';
				}
			int ans=0;
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++)
					if(c[i][j]=='@'){
						ans++;
						delete(i,j);
					}
			
			System.out.println(ans);
		}
	}
}