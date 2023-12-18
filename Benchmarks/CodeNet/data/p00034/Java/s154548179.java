import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while((s=br.readLine())!=null && !s.isEmpty())
		{
			int[] l = new int[10];
			int[] v = new int[2];
			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(s.split(",")[i]);
			}
			for (int i = 10; i < 12; i++) {
				v[i-10] = Integer.parseInt(s.split(",")[i]);
			}
			System.out.println(calc(l,v));
		}
	}
	private static int calc(int[] l, int[] v)
	{
		double sum_l=0.0;
		double intersection;
		for (int i = 0; i < l.length; i++) {
			sum_l+=l[i];
		}
		
		intersection = sum_l/(v[0]+v[1]) * v[0];
		int count=0;
		for(int i=0; intersection>0; i++){
			intersection -= l[i];
			count = i;
		}
		return count+1;
	}
}