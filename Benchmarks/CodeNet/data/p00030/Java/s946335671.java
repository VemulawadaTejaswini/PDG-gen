import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null)
		{
			int n = Integer.parseInt(s.split(" ")[0]);
			int sum = Integer.parseInt(s.split(" ")[1]);
			if(n==0 && sum==0) break;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0; i<=sum; i++)
				a.add(i);
			System.out.println(combination(a,0,sum,n));
		}
	}

	private static int combination(ArrayList<Integer> num, int index, int sum, int n)
	{
		if(n==0 || index == num.size()) 		 return 0; //answer not found 
		int rest=0;
		if((rest=sum-num.get(index))==0 && n==1) return 1; //answer found
		return combination(num, index+1, rest, n-1) + combination(num, index+1, sum, n);
	}	
}