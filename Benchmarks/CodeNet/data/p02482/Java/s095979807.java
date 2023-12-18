import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] str = read.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		if (a < b){
			System.out.println("a < b");
		}
		else if (a > b){
			System.out.println("a > b");
		}
		else {
			System.out.println("a == b");
		}
	}
}