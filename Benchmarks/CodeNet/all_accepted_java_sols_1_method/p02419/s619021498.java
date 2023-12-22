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
			String[] str = input.readLine().split(" ");

			if(str[0].equals("END_OF_TEXT"))
				break;

			String[] STR = new String[str.length];

			for(int num = 0; num < str.length; num++)
				STR[num] = str[num].toUpperCase();

			//単語の数を数える
			for(int num = 0; num < STR.length; num++)
			{
				if(STR[num].equals(WORD))
				{
					count++;
				}
			}
		}

		System.out.println(count);
	}
}

