import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int m,h;
		String strSub;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		String str = br.readLine();
		String strM = br.readLine();
		String strH = br.readLine();

		m = Integer.parseInt(strM);
		h = Integer.parseInt(strH);

		strSub = str.substring(0, h);

		str = str + strSub;

		System.out.println(str.substring(h) );

	}
}