/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		int[] b = new int[n - 1];
		for(int i = 0;i < n - 1;i++)
		{
		    b[i] = sc.nextInt();
		    if(i == 0)
		    s += b[0];
		    if(i > 0)
		    {
		        if(b[i] < b[i - 1])
		        b[i - 1] = b[i];
		    }
		}
		for(int i = 0;i < n - 1;i++)
		s += b[i];
		System.out.println(s);
	}
}