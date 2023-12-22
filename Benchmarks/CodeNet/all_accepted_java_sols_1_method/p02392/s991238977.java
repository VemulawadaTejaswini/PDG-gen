import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int a = Integer.parseInt(div[0]);
		int b = Integer.parseInt(div[1]);
		int c = Integer.parseInt(div[2]);
		if (a < b && b < c)
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}