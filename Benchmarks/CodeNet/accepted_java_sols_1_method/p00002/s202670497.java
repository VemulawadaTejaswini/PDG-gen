import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = a+b;
			int cnt = 0;
			while (c > 0)
			{
				cnt++;
				c/=10;
			}
			System.out.println(cnt);
		}
	}
}