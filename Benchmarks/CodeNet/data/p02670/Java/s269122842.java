import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
			int n=Integer.parseInt(sc.nextLine());
			String a[]=sc.nextLine().split(" ");
			
			boolean arr[][]=new boolean[n][n];
			int ans=0;
			for(int i=0;i<a.length;i++)
			{
				int an1=0;
				int an2=0;
				int an3=0;
				int an4=0;
				int cc=Integer.parseInt(a[i]);
				int r=(cc-1)/n;
				int c=(cc-1)%n;
				for(int j=r-1;j>=0;j--)
				{
					if(!arr[j][c]){an1+=1;}
				}
				for(int j=r+1;j<n;j++)
				{
					if(!arr[j][c]){an2+=1;}
				}
				for(int j=c+1;j<n;j++)
				{
					if(!arr[r][j]){an3+=1;}
				}
				for(int j=c-1;j>=0;j--)
				{
					if(!arr[r][j]){an4+=1;}
				}
				arr[r][c]=true;
				ans+=Math.min(Math.min(an1,an2),Math.min(an3,an4));
			}
			System.out.println(ans);

		
	}
}