import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=0, H=0, n=0;
		String[] animal = new String[2];
		n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++)
		{
			animal = br.readLine().split(" ");
			if(animal[0].compareTo(animal[1]) == 0)
			{
				T++;
				H++;
			}
			else if(animal[0].compareTo(animal[1]) > 0)	T = T + 3;
			else if(animal[0].compareTo(animal[1]) < 0)	H = H + 3;
		}
		System.out.println(T + " " + H);
	}
}

