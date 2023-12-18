import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));

		//与えられた数の各桁の和を計算する
		for(;;)
		{
			String originNum = input.readLine();

			char[] numbersC = originNum.toCharArray();

			String[] numbersS = new String[numbersC.length];

			//char型からString型に変換
			for(int num = 0; num < numbersC.length; num++)
			{
				numbersS[num] = String.valueOf(numbersC[num]);
			}

			int[] numbers = new int[numbersS.length];

			//String型からint型に変換
			for(int num = 0; num < numbersS.length; num++)
			{
				numbers[num] = Integer.parseInt(numbersS[num]);
			}

			if((numbers[0] == 0)&&(numbers.length == 1))
			{
				break;
			}

			int sum = 0;

			//数の各桁の和を計算する
			for(int num = 0; num < numbers.length; num++)
			{
				sum = sum + numbers[num];
			}

			System.out.println(sum);
		}
	}
}

