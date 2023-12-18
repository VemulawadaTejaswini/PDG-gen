import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException
	{

	BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("3乗する数字を入力してください");
	String str = br.readLine();
	int x = Integer.parseInt(str);


	System.out.println( x*x*x );

	}
}