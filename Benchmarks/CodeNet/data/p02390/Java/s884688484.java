import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int n,h,m,s;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		n = Integer.parseInt(br.readLine() );

		h = n/3600;

		m = (n/60)%60;

		s = n%60;

		System.out.println( h + ":" + m + ":" + s);
	}
}