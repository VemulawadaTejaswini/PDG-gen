import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1;; i++)
		{
			String str[] = input(2);
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(a == 0 && b == 0) break;
			for(int j = 0; j < a; j++)
			{
				for(int k = 0; k < b; k++)
				{
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
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

