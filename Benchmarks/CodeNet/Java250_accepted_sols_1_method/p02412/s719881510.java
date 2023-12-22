import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = new String[2];
		int n=0, x=0, count=0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(true)
		{
			strs = br.readLine().split(" ");
			n = Integer.parseInt(strs[0]);
			x = Integer.parseInt(strs[1]);
			if(n==0 && x==0)	break;
			for(int i=1; i<=n; i++)
			{
				for(int j=i+1; j<=n; j++)
				{
					for(int k=j+1; k<=n; k++)
					{
						if(i+j+k==x)
						{
							count++;
						}
					}
				}
			}
			result.add(count);
			count = 0;
		}
		for(int cnt=0; cnt<result.size(); cnt++)
		{
			System.out.println(result.get(cnt));
		}
	}
}