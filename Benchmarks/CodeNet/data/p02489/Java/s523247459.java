import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		int x = 1;
		int i = 0;
		
		while (true){
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			x = Integer.parseInt(read.readLine());
			if (x == 0){
				break;
			}
			i++;
			System.out.println("Case " + i + ": " + x);
		}
	}
}