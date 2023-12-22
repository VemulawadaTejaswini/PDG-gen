import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int n = Integer.parseInt(div[0]);
		int m = Integer.parseInt(div[1]);
		if (n > m){
			System.out.println("a > b");
		} else if (n < m){
			System.out.println("a < b");
		} else {
			System.out.println("a == b");
		}
	}
}