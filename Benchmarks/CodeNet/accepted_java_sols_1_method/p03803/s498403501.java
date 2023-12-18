import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int B = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
		if(A == 1) A = 14;
		if(B == 1) B = 14;
		if(A > B) System.out.println("Alice");
		if(A < B) System.out.println("Bob");
		if(A == B) System.out.println("Draw");
	}
}