import java.io.*;
import java.math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int i=0; i<n; i++)
		{
		    int x = in.nextInt();
		    int y = in.nextInt();
		    double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		    if (dist<=k)
		    {
		        count++;
		    }
		}
		System.out.println(count);
	}
}