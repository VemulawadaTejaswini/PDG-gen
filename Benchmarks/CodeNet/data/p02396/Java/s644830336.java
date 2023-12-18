import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1;; i++)
		{
			String str = br.readLine();
			int j = Integer.parseInt(str);
			if(j == 0)break;
			System.out.println("Case " + i + ": " + j);
		}
	}

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br.readLine();
		int j = 0;
		for(int i = 0; i < Num; i++)
		{
			if(i < Num - 1)
			{
				str[i] = str2.substring(j, str2.indexOf(" ", j));
				j = str2.indexOf(" ", j) + 1;
			}
			else
			{
				str[i] = str2.substring(j);
			}
		}
		return str;
	}

}

