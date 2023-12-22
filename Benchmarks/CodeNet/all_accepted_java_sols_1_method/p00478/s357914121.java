import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		int size = str.length() - 1;
		int n = stdIn.nextInt();
		int ans = 0;
		for(int i = 0; i < n; ++i)
		{
			String ring = stdIn.next();
			for(int j = 0; j < size; ++j)
			{
				ring += ring.charAt(j);
			}
			if(ring.contains(str))
			{
				++ans;
			}
		}
		System.out.println(ans);
	}
}