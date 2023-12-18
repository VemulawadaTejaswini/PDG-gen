/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		if(n == 0)
		System.out.println(k);
		else
		{
		    HashSet<Integer> st = new HashSet<Integer>();
		    int[]a = new int[n];
		    int i;
		    for(i=0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		        st.add(a[i]);
		    }
		    int min = 999,val=0;
		    Arrays.sort(a);
		    for(i=a[0]; i<a[n-1]; i++)
		    {
		        if(!st.contains(i))
		        {
		            int x = k - i;
		            if(x < 0)
		            {
		                x = x * (-1);
		            }
		            if(x < min)
		            {
		                val = i;
		                min = x;
		            }
		        }
		    }
		    if(val == 0)
		    {
		        val = a[n-1] + 1;
		    }
		    System.out.println(val);
		}
	}
}
