import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = 0;
		int shuf = 0;
		
		while(true)
		{
			sb.append(br.readLine());
			if(sb.toString()=="-") break;
			num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++)
			{
				shuf = Integer.parseInt(br.readLine());
				String buf = sb.substring(0, shuf);
				sb.delete(0, shuf);
				sb.append(buf);
			}
			System.out.println(sb.toString());
			sb.delete(0, num);
		}
		
	}
}