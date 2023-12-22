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
		String line = "";
		String[] strArray;
		int result = 0;
		int cnt = 0;

		while (cnt < 200 && (line = br.readLine()) != null)
		{
			strArray = line.split(" ", 0);
			result = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]);
			lstInt.add(Integer.toString(result).length());
			++cnt;
		}

		for (int digit : lstInt)
		{
			System.out.println(digit);
		}

	}
}