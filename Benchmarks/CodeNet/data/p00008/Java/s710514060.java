import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Sum
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null)
		{
		    int n = Integer.valueOf(s);
		    int comb=0;
	    	    int[] a = new int[10];
		    for(int i=0; i<10; i++)
   		    	a[i] = i;

  	            for(int b=0; b<10; b++)
	                for(int c=0; c<10; c++)
			    for(int d=0; d<10; d++)
			    	if(Arrays.binarySearch(a,n-b-c-d)>=0)
				comb++;
  		    System.out.println(comb);
		}
	}
}