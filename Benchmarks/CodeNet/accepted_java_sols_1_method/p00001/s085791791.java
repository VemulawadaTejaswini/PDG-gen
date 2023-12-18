import java.io.*; 

class Main
{

	public static void main(String[] a) throws IOException
	{
		int x[]=new int[100];
		int k=0;

		BufferedReader d =new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<10;i++)
		{
			String str=d.readLine();
			x[i]=Integer.parseInt(str);
		}

		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(x[i]>x[j])
				{
					k=x[i];
					x[i]=x[j];
					x[j]=k;
				}
			}
		}

		for(int i=0;i<3;i++)System.out.println(x[i]);
	}
}