import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), M = Integer.parseInt(ST.nextToken()), homeworkDays = 0;
		ST = new StringTokenizer(BR.readLine());
		for (; M > 0; M--) homeworkDays += Integer.parseInt(ST.nextToken());
		System.out.println((homeworkDays <= N) ? N - homeworkDays : -1);
	}
}
