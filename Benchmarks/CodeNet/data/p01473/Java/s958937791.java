import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{

    public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s = in.readLine();
	int[] alpha = new int[30];
	for(int i=0;i<30;i++)
	    alpha[i] = 0;
	for(int i=0;i<s.length();i++)
	    alpha[s.charAt(i)-'a']++;
	int cnt = 0;
	for(int i=0;i<27;i++)
	    {
		if(alpha[i]%2 == 1)
		    cnt++;
		if(cnt >= 2)
		    break;
	    }

	if(cnt >= 2)
	    {
		System.out.println("0");
	    }
	else
	    {
		int n = 0;
		int[] counter = new int[28];
		int index = 0;
		for(int i=0;i<28;i++)
		    {
			if(alpha[i] == 0)
			    continue;
			if(alpha[i]%2==1)
			    alpha[i]--;
			counter[index++] = alpha[i]/2;
			n += alpha[i]/2;
			counter[index] = -1;
		    }

		BigInteger N = new BigInteger("1");
		BigInteger abc = new BigInteger("1"); 

		for(int i=2;i<=n;i++)
		    N = N.multiply(new BigInteger(Integer.toString(i)));

		//System.out.println("N = " + N);
		for(int i=0;i<28;i++)
		    {
			if(counter[i] == -1)
			    break;
			for(int j=2;j<=counter[i];j++)
			    {
				abc = abc.multiply(new BigInteger(Integer.toString(j)));
			    }
		    }
		//System.out.println("abc = " + abc);
		System.out.println(N.divide(abc));


	    }

    }

}