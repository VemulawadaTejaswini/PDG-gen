import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		double[] ans=new double[2];
		double det=0;
		while((str=br.readLine())!=null)
		{
			String[] aa=str.split(" ");
			double[] a=new double[aa.length];
			for(int i=0;i<aa.length;i++)
			{
				a[i]=Double.parseDouble(aa[i]);
			}
			det=a[0]*a[4]-a[1]*a[3];
			ans[0]=(a[4]*a[2]-a[1]*a[5])/det;
			ans[1]=(-a[3]*a[2]+a[0]*a[5])/det;

			System.out.printf("%.3f %.3f",ans[0],ans[1]);


		}
	}
}