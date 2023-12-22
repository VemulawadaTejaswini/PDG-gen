import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] s = br.readLine().toCharArray();
		
		int N = s.length;
		for(int i=0; i<N/2; i++){
			char temp = s[i];
			s[i] = s[N-i-1];
			s[N-i-1] = temp;
		}

		System.out.println(s);
	}
}