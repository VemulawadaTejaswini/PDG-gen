import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int j = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
		System.out.println((i * j) + " " + ((i + j) * 2));
	}

}

