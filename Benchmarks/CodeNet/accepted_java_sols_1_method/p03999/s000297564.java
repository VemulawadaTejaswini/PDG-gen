import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		long n = s.length();
		long sum = 0;
		
		for(int i=0;i<(1<<n-1);i++)
		{
			int p = 0;
			for(int j=0;j<n-1;j++)
			{
				if((i&(1<<j)) > 0)
				{
					String str = s.substring(p, j+1);
					p = j+1;
					sum += Long.parseLong(str);
				}
			}
			String str = s.substring(p);
			sum += Long.parseLong(str);
		}
		System.out.println(sum);
	}
}
