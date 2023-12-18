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
			String[] buf=str.split(" ");
			int ans=1+(int)Math.log10((double)(Integer.parseInt(buf[0])+Integer.parseInt(buf[1])));
			System.out.println(ans);
		}


	}

}