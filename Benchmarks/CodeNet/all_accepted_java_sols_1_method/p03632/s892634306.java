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
		int A = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int B = Integer.parseInt(str.substring(str.indexOf(" ") + 1,str.indexOf(" ", str.indexOf(" ") + 1)));
		int C = Integer.parseInt(str.substring(str.indexOf(" ", str.indexOf(" ") + 1) + 1,str.indexOf(" ", str.indexOf(" ", str.indexOf(" ") + 1) + 1)));
		int D = Integer.parseInt(str.substring(str.indexOf(" ", str.indexOf(" ", str.indexOf(" ") + 1) + 1) + 1));
		//System.out.println(A + " " + B + " " + C + " " + D);
		int E = 0;
		if(A < C) E = C;
		else E = A;
		int F = 0;
		if(B > D) F = D;
		else F = B;
		if(F - E < 0) System.out.println("0");
		else System.out.println(F - E);
	}

}
