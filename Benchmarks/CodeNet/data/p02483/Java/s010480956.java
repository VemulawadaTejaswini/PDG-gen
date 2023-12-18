import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = reader.readLine();
			String[] strAry = line.split("\\s+");
			int x = Integer.parseInt(strAry[0]);
			int y = Integer.parseInt(strAry[1]);
			int z = Integer.parseInt(strAry[2]);
			int p;
			int q = 0;

			while(q != 1)
			{
				if(x>y)
				{
					p = y;
					y = x;
					x = p;
				}else if(x>z)
				{
					p = z;
					z = x;
					x = p;
				}else if (y > z)
				{
					p = z;
					z = y;
					y = p;
				}else
				{
					q++;
				}

			}

			System.out.printf("%d %d %d",x,y,z);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}