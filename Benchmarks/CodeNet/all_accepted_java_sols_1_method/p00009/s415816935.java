import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int premax=2;
		int[] h=new int[1000000];
		h[1]=0;h[2]=1;
		while((str=br.readLine())!=null)
		{
			int n=Integer.parseInt(str);
			if(premax<n)
			{
				for(int i=premax+1;i<=n;i++)
				{
					h[i]=h[i-1];
					if(i%2==0)
					{}
					else
					{
						for(int j=3;j<=(int)Math.sqrt(i);j+=2)
						{
							if(i%j==0){h[i]--;break;}
						}
						h[i]++;

					}
				}
				premax=n;
			}
			System.out.println(h[n]);


		}
	}

}