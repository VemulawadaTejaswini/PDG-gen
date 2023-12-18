
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main{
	static long mod=1000000007;
	static int ans=0;
	static char[][] arr;
	static int n;
	static int m;
	static int rem;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		n=Integer.valueOf(cmd[0]);
		m=Integer.valueOf(cmd[1]);
		int k=Integer.valueOf(cmd[2]);
		arr=new char[n][m];
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			for(int j=0;j<m;j++)
			{
				arr[i][j]=s.charAt(j);
			}
		}
		int cnt=0;
		int[] row=new int[n];
		int[] col=new int[m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]=='#')
				{	
					cnt++;
					row[i]++;
					col[j]++;
				}
			}
		}
		rem=cnt-k;
		ans=0;
//			System.out.println(ans);
			for(int i=0;i<=Math.pow(2, n)-1;i++)
			{
				int x=0;
				int y=0;
				for(int j=0;j<n;j++)
				{
					if((i&(1<<j))!=0)
						y=y+row[j];
				}
				for(int j=0;j<=Math.pow(2, m)-1;j++)
				{
					x=y;
					for(int l=0;l<m;l++)
					{
						if((j&(1<<l))!=0)
							x=x+col[l];
					}
					for(int l=0;l<n;l++)
					{
						if((i&(1<<l))!=0)
						{
						for(int a=0;a<m;a++)
						{
							if((j&(1<<a))!=0)
							{
								if(arr[l][a]=='#')
									x--;
							}
						}}
					}
					if(x==rem)
					{
//						System.out.println(i+" "+j);
						ans++;
					}
				}
			}
		System.out.println(ans);
	}
}
