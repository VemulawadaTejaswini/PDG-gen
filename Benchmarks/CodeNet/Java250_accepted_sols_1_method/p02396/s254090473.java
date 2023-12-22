import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		int[] n = new int[65535];
		int i=0,j;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		while(true)
		{
			n[i] = Integer.parseInt(br.readLine() );

			if(n[i]==0) break;
			else i++;
		}

		for(j=0; j<i; j++) System.out.println("Case " + (j+1) + ": " + n[j]);

	}
}