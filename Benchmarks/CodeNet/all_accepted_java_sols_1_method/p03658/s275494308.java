import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String str2=br.readLine();
		String[] a=str.split(" ");
		String[] b=str2.split(" ");
		int[] aa=new int[2];
		for(int i=0;i<2;i++)
		{
			aa[i]=Integer.parseInt(a[i]);
		}
		int[] bb=new int[aa[0]];
		for(int i=0;i<aa[0];i++)
		{
			bb[i]=Integer.parseInt(b[i]);
		}
		int buf=0;
		for(int i=0;i<aa[0];i++)
		{
			for(int j=i+1;j<aa[0];j++)
			{
				if(bb[i]<bb[j])
				{
					buf=bb[i];
					bb[i]=bb[j];
					bb[j]=buf;
				}
			}
		}
		int max=0;
		for(int i=0;i<aa[1];i++)
		{
			max+=bb[i];
		}
		System.out.println(max);



	}

}
