import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> lstInt = new ArrayList<Integer>();
		String[] strArray = br.readLine().split(" ");

		while (strArray != null)
		{
			int result = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
			lstInt.add(Integer.toString(result).length());
		}

		for(int digit : lstInt)
		{
			System.out.println(digit);
		}

	}
}