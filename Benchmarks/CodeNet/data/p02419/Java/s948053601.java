import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String word = input.readLine();

		String WORD = word.toUpperCase();

		int count = 0;

		while(true)
		{
			String str = input.readLine();

			if(str.equals("END_OF_TEXT"))
				break;

			String STR = str.toUpperCase();

			//単語の数を数える
			for(int start = 0; start < STR.length() - WORD.length(); start++)
			{
				if(STR.charAt(start) == WORD.charAt(0))
				{
					//2文字以降の判定
					for(int next = 1; next < WORD.length(); next++)
					{
						if(STR.charAt(next + start) != WORD.charAt(next))
							break;

						if(next + 1 == WORD.length())
						{
							count++;

							start = start + WORD.length();

							break;
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}

