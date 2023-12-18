
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int a=Integer.valueOf(cmd[1]);
		int b=Integer.valueOf(cmd[2]);
		int c=Integer.valueOf(cmd[3]);
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=br.readLine();
		}
		String[] ans=new String[n];
		int bool=0;
		for(int i=0;i<n;i++)
		{
			String g=arr[i];
			if(g.equals("AB"))
			{
				if(a>b)
				{
					a--;
					b++;
					ans[i]="B";
				}
				else if(a<b)
				{
					a++;
					b--;
					ans[i]="A";
				}
				else
				{
					if(i+1<n && arr[i+1].equals("AC"))
					{
						a++;
						b--;
						ans[i]="A";
					}
					else
					{
						a--;
						b++;
						ans[i]="B";
					}
				}
				if(a<0 || b<0)
				{
					bool=1;
					break;
				}
			}
			else if(g.equals("AC"))
			{
				if(a>c)
				{
					a--;
					c++;
					ans[i]="C";
				}
				else if(a<c)
				{
					a++;
					c--;
					ans[i]="A";
				}
				else
				{
					if(i+1<n && arr[i+1].equals("AB"))
					{
						a++;
						c--;
						ans[i]="A";
					}
					else
					{
						a--;
						c++;
						ans[i]="C";
					}
				}
				if(a<0 || c<0)
				{
					bool=1;
					break;
				}
			}
			else if(g.equals("BC"))
			{
				if(b>c)
				{
					b--;
					c++;
					ans[i]="C";
				}
				else if(b<c)
				{
					b++;
					c--;
					ans[i]="B";
				}
				else
				{
					if(i+1<n && arr[i+1].equals("AB"))
					{
						b++;
						c--;
						ans[i]="B";
					}
					else
					{
						b--;
						c++;
						ans[i]="C";
					}
				}
				if(c<0 || b<0)
				{
					bool=1;
					break;
				}
			}
		}
		if(bool==1)
			System.out.println("No");
		else
		{
			System.out.println("Yes");
			for(int i=0;i<n;i++)
			{
				System.out.println(ans[i]);
			}
		}
	}

}
