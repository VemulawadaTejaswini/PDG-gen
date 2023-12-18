import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;)
		{
			String str = br.readLine();
			double a = Double.parseDouble(str.substring(0, str.indexOf(" ")));
			int i = str.indexOf(" ");
			String  b = str.substring(i + 1, str.indexOf(" ", i + 1));
			double c = Double.parseDouble(str.substring(str.indexOf(" ", i + 1)));
			double d = 0;;
			if(b.equals("?"))break;
			else if(b.equals("+")) d = a + c;
			else if(b.equals("-")) d = a - c;
			else if(b.equals("*")) d = a * c;
			else if(b.equals("/")) d = a / c;
			System.out.println((int)d);
		}
	}

}

