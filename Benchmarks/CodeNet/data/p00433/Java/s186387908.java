import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputA = br.readLine().split(" ");
		String[] inputB = br.readLine().split(" ");

		if (sumScore(inputA) > sumScore(inputB))
			System.out.println(sumScore(inputA));
		else
			System.out.println(sumScore(inputB));
	}

	private static int sumScore(String[] score)
	{
		int sum = 0;
		for (int i = 0; i < score.length; ++i)
		{
			sum += Integer.parseInt(score[i]);
		}
		return sum;
	}
}