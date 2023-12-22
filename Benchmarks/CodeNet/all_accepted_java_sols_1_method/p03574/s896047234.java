import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String	s  = new String();
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] ans = new char[H+2][W+2];
		
		for(int i = 1;i<=H;i++) 
		{	
			s=sc.next();
			for(int k=1;k<=W;k++)
				ans[i][k] = s.charAt(k-1);
			
		}
		
		for(int i = 1;i<=H;i++) 
			for(int k=1;k<=W;k++)
				if(ans[i][k]=='.')	ans[i][k]='0';
			
		
		for(int i = 1;i<=H;i++) 
			for(int k=1;k<=W;k++) 
			{
				if(ans[i][k]=='#') 	{  ans[i][k]='#'; continue; }
				
				if(ans[i-1][k-1]=='#') ans[i][k]++;
				if(ans[i-1][ k ]=='#') ans[i][k]++;
				if(ans[i-1][k+1]=='#') ans[i][k]++;
				
				if(ans[ i ][k-1]=='#') ans[i][k]++;
				if(ans[ i ][k+1]=='#') ans[i][k]++;
				
				if(ans[i+1][k-1]=='#') ans[i][k]++;
				if(ans[i+1][ k ]=='#') ans[i][k]++;
				if(ans[i+1][k+1]=='#') ans[i][k]++;
			
		}

		for(int i = 1;i<=H;i++) {
			for(int k=1;k<=W;k++) 
			{
				System.out.print(ans[i][k]);
			}
		System.out.println("");}
		
	}

}

