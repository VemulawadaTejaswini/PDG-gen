
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int x;
		int i = 0;

		try {

			String line = reader.readLine();
			String[] strAry = line.split("\\s+");
			x = Integer.parseInt(strAry[0]);

			System.out.printf(" ");
			for(i = 1;i<=x;i++)
			{
				if  ( (i%3) ==0 )
				{

					System.out.printf("%d",i);
					i++;

				}

				if ( (i%10) == 3) 
				{

					System.out.printf("%d",i);
					i++;

				}


			}


		}catch (IOException e)
		{
			System.out.println(e);
		}
	}
}