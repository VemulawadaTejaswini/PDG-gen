import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			int i = 0;
			int j;
			int x[] = new int[100];


		try {

			String line = reader.readLine();
				String[] strAry = line.split("\\s+");
			for (j=0;j<100;j++)
			{
				x[j] = 1;
			}

			while(true)
			{
				x[i] = Integer.parseInt(strAry[0]);
				if (x[i] == 0) break;
				line = reader.readLine();
				strAry = line.split("\\s+");
				i++;
			}

			for (j=0;j<i;j++)
			{
				System.out.printf("Case %d: %d\n",j+1,x[j]);
			}
		

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}