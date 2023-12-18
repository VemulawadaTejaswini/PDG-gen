import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		String str = input.readLine();

		String want = input.readLine();

		boolean judge = false;

		if(want.length() == 1)
		{
			//入力した文字があるか判定
			for(int num = 0; num < str.length(); num++)
			{
				if(str.charAt(num) == want.charAt(0))
				{
					judge = true;
					break;
				}
			}
		}

		else
		{
			//入力した文字列が作れるか判定
			for(int start = 0; start < str.length(); start++)
			{
				if(str.charAt(start) == want.charAt(0))
				{
					//2文字以降の判定
					for(int next = 1; next < want.length(); next++)
					{
						//繋ぎ目を越える前
						if(next + start < str.length())
						{
							if(str.charAt(next + start) != want.charAt(next))
								break;
						}

						//繋ぎ目を超えた後
						else if(next + start >= str.length())
						{
							if(str.charAt(next + start - str.length()) != want.charAt(next))
								break;
						}

						//入力した文字列が作れた場合
						if(next + 1 == want.length())
							judge = true;
					}
				}
			}
		}

		if(judge)
			System.out.println("Yes");

		else
			System.out.println("No");
	}
}

