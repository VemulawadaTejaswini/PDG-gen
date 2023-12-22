import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		char[] str = input.readLine().toCharArray();

		int order = Integer.parseInt(input.readLine());

		//命令をorder回実行する
		for(int kai = 0; kai < order; kai++)
		{
			String[] orderStr = input.readLine().split(" ");

			int start = Integer.parseInt(orderStr[1]);

			int end = Integer.parseInt(orderStr[2]);

			//命令がprintのとき
			if(orderStr[0].equals("print"))
			{
				//startからendまでの文字列を表示する
				for(int num = start; num <= end; num++)
					System.out.print(str[num]);

				System.out.println();
			}

			//命令がreverseのとき
			else if(orderStr[0].equals("reverse"))
			{

				char[] reverse = new char[end - start +1];

				//reverseに指定された範囲の文字列を逆順に代入する
				for(int num = 0; num < end - start + 1; num++)
					reverse[num] = str[end - num];

				//指定範囲を逆順にした文字列を代入する
				for(int num = 0; num < end - start + 1; num++)
					str[start + num] = reverse[num];
			}

			//命令がreplaceのとき
			else if(orderStr[0].equals("replace"))
			{
				char[] replace = orderStr[3].toCharArray();

				//指定範囲に入力された文字列を代入する
				for(int num = 0; num <end - start + 1; num++)
					str[start + num] = replace[num];
			}
		}
	}
}

