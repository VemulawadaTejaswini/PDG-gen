import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = new String[4];
		strs = br.readLine().split(" ");
		Double[] coos = new Double[4];
		for(int i=0;i<strs.length;i++)	coos[i] = Double.parseDouble(strs[i]);
		
		double ver=0, hor=0, ans=0;
		ver = Math.abs(coos[2] - coos[0]);
		hor = Math.abs(coos[3] - coos[1]);
		ans = Math.sqrt(ver*ver+hor*hor);
		System.out.println(ans);
	}
}

