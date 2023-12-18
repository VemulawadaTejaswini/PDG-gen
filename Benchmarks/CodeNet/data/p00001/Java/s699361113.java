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

		for (int i = 0; i < 10; ++i)
		{
			lstInt.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(lstInt);

		for (int i = 0; i < 3; ++i)
			System.out.println(lstInt.get(i));

	}

}