import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt(), R = sc.nextInt();
			if(N==0&&R==0) break;
			
			Stack<int[]> st = new Stack<int[]>();
			for (;R-->0;) st.push(new int[] { sc.nextInt(), sc.nextInt() });
			
			int top = 1;
			for(;!st.isEmpty();)
			{
				int[] pc = st.pop();
				int p = pc[0], c = pc[1];
				if (top <= c)
				{
					top += p - 1;
				}
				else if (c < top && top <= c + p - 1)
				{
					top -= c;
				}
			}
			System.out.println(N - (top - 1));
		}
	}
}