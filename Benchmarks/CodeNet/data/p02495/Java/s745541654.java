
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int x[] = new int[100];
		int y[] = new int[100];
		int i = 0;
		int j,k,l,m;

		try {

			String line = reader.readLine();
			String[] strAry = line.split("\\s+");
			
			while(true)
			{
				x[i] = Integer.parseInt(strAry[0]);
				y[i] = Integer.parseInt(strAry[1]);
			
				if ((x[i] == 0) ||(y[i] == 0)) break;

				line = reader.readLine();
				strAry = line.split("\\s+");

				i++;
			}

			for(j=0;j<i;j++)
			{
				
				m=0;
				for(k=0;k<x[j];k++)
				{
					for(l=0;l<y[j];l++)
					{
						if((m%2)==0) System.out.printf("#");
						else if((m%2)!=0) System.out.printf(".");
						m++;
					
					}

					if((y[j]%2)==0) m++;

					System.out.printf("\n");

				}

				System.out.printf("\n");

			}


		} catch (IOException e) {
			System.out.println(e);
		}
	}
}