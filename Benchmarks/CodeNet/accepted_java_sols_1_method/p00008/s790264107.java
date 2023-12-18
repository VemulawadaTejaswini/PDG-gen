import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null)
		{
			int n=Integer.parseInt(str);
			int ans=0;
			if(n>36){}
			else
			{
				for(int i=0;i<=9;i++)
				{
					for(int j=0;j<=9;j++)
					{
						for(int k=0;k<=9;k++)
						{
							for(int l=0;l<=9;l++)
							{
								if(i+j+k+l==n){ans++;}
							}
						}
					}
				}
			}
			System.out.println(ans);

		}
	}

}