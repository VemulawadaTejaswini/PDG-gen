import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		try
		{
			while(true)
			{
				String str[] = input(1);
				int sum = 0;
				for(int i = 0; i < str[0].length(); i++)
				{
					sum += Integer.parseInt(str[0].toCharArray()[i] + "");
				}
				if(sum != 0) System.out.println(sum);
				else break;
			}
		}
		catch(IOException e)
		{
		}
	}

	/*
	public static int Calc(int[] a, int f, int e)
	{
		ArrayList<Integer> list[] = new ArrayList[2];
		return e;
	}
	//*/

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

