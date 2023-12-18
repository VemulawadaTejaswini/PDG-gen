import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<N;i++)
			set.add(Integer.parseInt(s[i]));
		
		if(set.size()==N)
			out.println("YES");
		else
			out.println("NO");
		
	}
}


