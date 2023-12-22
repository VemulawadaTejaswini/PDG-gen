import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		String a[] = new String[10000];
		String b[] = new String[10000];
		int i =0;
		while(scan.hasNext())
		{

			String str = scan.next();
			StringTokenizer st = new StringTokenizer(str, ",");

			a[i+1]=st.nextToken();
			b[i+1]=st.nextToken();

			i++;
		}

		int A=0;
		int B=0;
		int AB=0;
		int O=0;
		for(int j=1; j<=i; j++)
		{
			if(b[j].equals("A"))
				A++;
			else if(b[j].equals("B"))
				B++;
			else if(b[j].equals("AB"))
				AB++;
			else if(b[j].equals("O"))
				O++;
		}

		System.out.println(A);
		System.out.println(B);
		System.out.println(AB);
		System.out.println(O);

	}

}