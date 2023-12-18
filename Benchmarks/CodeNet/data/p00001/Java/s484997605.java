import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> lstInt = new ArrayList<Integer>();
		String str;

		while ((str = br.readLine()) != null)
		{
			lstInt.add(Integer.parseInt(str));
			str = br.readLine();
		}

			Collections.sort(lstInt);

			for (int i = 0; i < 3; ++i)
				System.out.println(lstInt.get(i));

	}

}