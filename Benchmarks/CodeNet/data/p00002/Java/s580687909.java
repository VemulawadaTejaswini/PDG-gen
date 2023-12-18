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
		String[] strArray;

		for (int i = 0; i < 200; ++i)
		{
			if (br.readLine().trim() == null)
				break;
			
			strArray = br.readLine().split(" ");
			int result = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
			lstInt.add(Integer.toString(result).length());
		}

		for (int digit : lstInt)
		{
			System.out.println(digit);
		}

	}
}