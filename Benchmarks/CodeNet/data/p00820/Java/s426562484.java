import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

    private static int n;

    private static int rec(int sum,int pre,int cnt)
    {

	if(sum > n)
	    return 0;

	if(sum == n)
	    return 1;

	if(cnt >= 3)
	    {
		//return sum == n?1:0;
		
		int dif = n-sum;
		for(int i=pre;i<=dif;i++)
		    if(i*i == dif)
			return 1;

		return 0;
		
	    }





	int counter = 0;
	for(int i=pre;sum+Math.pow(i,2)<=n;i++)
	    {
		counter += rec(sum+i*i,i,cnt+1);
	    }
	return counter;
    }

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


	while(true)
	    {

		n = Integer.parseInt(in.readLine());
		if(n == 0)
		    break;

		/*
		for(int i=0;i*i<=n;i++)
		    {
			for(int j=i;j*j+i*i<=n;j++)
			    {
				for()
				    {


				    }
			    }
		    }
		*/



		System.out.println(rec(0,1,0));
	    }
    }

}