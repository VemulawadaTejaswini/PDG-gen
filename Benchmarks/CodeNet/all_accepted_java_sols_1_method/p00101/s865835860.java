import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int n = Integer.parseInt(a);
		while(n != 0)
		{
			String str = br.readLine();
			char[] s = str.toCharArray();
			for(int i = 0; i < s.length; ++i)
			{
				if(s[i] == 'H' && i + 6 < s.length && s[i + 1] == 'o' && s[i + 2] == 's'
						 && s[i + 3] == 'h' && s[i + 4] == 'i' && s[i + 5] == 'n'
						 && s[i + 6] == 'o')
				{
					s[i + 6] = 'a';
				}
			}
			System.out.println(s);
			--n;
		}
	}
}