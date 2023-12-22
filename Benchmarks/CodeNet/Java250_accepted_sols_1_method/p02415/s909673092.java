import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String originStr = input.readLine();

		String upperStr = originStr.toUpperCase();

		String lowerStr = originStr.toLowerCase();

		char[] originChar = originStr.toCharArray();

		char[] upperChar = upperStr.toCharArray();

		char[] lowerChar = lowerStr.toCharArray();

		//1文字ずつ比較し、大文字小文字を逆転して表示する
		for(int num = 0; num < originChar.length; num++)
		{
			if(originChar[num] != upperChar[num])
			{
				System.out.print(upperChar[num]);
			}
			else
			{
				System.out.print(lowerChar[num]);
			}
		}

		System.out.println();

	}
}

