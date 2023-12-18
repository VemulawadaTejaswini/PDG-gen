
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), M = Integer.parseInt(ST.nextToken()), observationHeight[] = new int[N]; boolean goodObservations[] = new boolean[N];
		Arrays.fill(goodObservations, true);
		ST = new StringTokenizer(BR.readLine());
		for (int i = 0; i < N; i++) observationHeight[i] = Integer.parseInt(ST.nextToken());
		for (; M > 0; M--) 
		{
			ST = new StringTokenizer(BR.readLine());
			int Start = Integer.parseInt(ST.nextToken()) - 1, End = Integer.parseInt(ST.nextToken()) - 1;
			if (observationHeight[Start] < observationHeight[End]) goodObservations[Start] = false;
			else if (observationHeight[Start] > observationHeight[End]) goodObservations[End] = false;
			else /*if (observationHeight[Start] == observationHeight[End])*/ { goodObservations[Start] = false; goodObservations[End] = false;}
		}
		int goodCount = 0;
		for (int i = 0; i < N; i++)
		{
			if (goodObservations[i]) goodCount++;
		}
		System.out.println(goodCount);
	}
}
