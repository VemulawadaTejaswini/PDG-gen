import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader stdReader =
		new BufferedReader(new InputStreamReader(System.in));
		String natural[] = stdReader.readLine().split(" ",0);
		int x = Integer.parseInt(natural[0]);
		int y = Integer.parseInt(natural[1]);
		if (x < y) {
			x = x^y;
			y = x^y;
			x = x^y;
		}
		while (y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		System.out.println(x);
	}
}