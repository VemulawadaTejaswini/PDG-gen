import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

    public static boolean[] isprime;
    public static List<Integer> prime;

    static void create()
    {
	prime = new LinkedList<Integer>();
	isprime = new boolean[1000010];
	int p = 0;
	for(int i=0;i<=1000009;i++)isprime[i] = true;
	isprime[0] = isprime[1] = false;
	for(int i = 2;i<=1000009;i++)
	    {
		if(isprime[i])
		    {
			prime.add(i);
			for(int j=2*i;j<=1000009;j+=i)
			    isprime[j] = false;
		    }
	    }
    }

    public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	create();
	while(true)
	    {
		int n = Integer.parseInt(in.readLine());
		if(n == 0)
		    break;
		int cnt = 0;
		for(int i=1;i<=n;i++)
		    {
			if(i > n-i)
			    break;
			if(isprime[i] && isprime[n-i])
			    {
				cnt++;
			    }
		    }
		System.out.println(cnt);
	    }	

    }
    
}