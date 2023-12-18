import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int total=0;
		double sum = 0;
		double count=0;
		while(sc.hasNext())
		{
			String str = sc.next();
			StringTokenizer st = new StringTokenizer(str, ",");

			String a = st.nextToken();
			String b = st.nextToken();

			sum += Integer.valueOf(b);
			total += Integer.valueOf(a)*Integer.valueOf(b);
			count++;
		}

		int ave =(int) Math.round(sum/count);

		System.out.println(total);
		System.out.println(ave);
	}

}