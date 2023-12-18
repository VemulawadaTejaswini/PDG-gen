import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int a[] = new int[n];
		int b[] = new int[m];
			int num =0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			a[i]= Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)
			b[i]= Integer.parseInt(st.nextToken());
		int c=0;
		int ka=0,kb=0;
		while(c<=k)
		{
			if(ka==n||kb==m)
				break;
			if(a[ka]<b[kb])
			{
				if(c+a[ka]>k)
					break;
				c+=a[ka];
				ka++;
				num++;
			}
			else if(b[kb]<a[ka])
			{
				if(c+b[kb]>k)
					break;
				c+=b[kb];
				kb++;
				num++;
			}
			else
			{
				if(c+a[ka]>k)
					break;
				num++;
				c+=a[ka];
				int x = ka;
				int y = kb;
				while(a[x]==b[y])
				{
					x++;
					y++;
					if(x==n-1)
					{
						
						ka++;
						
						break;
					}
					if(y==m-1)
					{
						//if(c+b[kb]<=k){
						//c+=b[kb];
						kb++;
						//num++;}
						break;
					}
					if(a[x]<b[y])
					{
						//c+=a[ka];
						//ka++;
						//num++;
						break;
					}
					else if(b[y]<a[x])
					{
						//c+=b[kb];
						kb++;
						//num++;
						break;
					}
				}

			}
		}
			System.out.println(num);
}
		
}