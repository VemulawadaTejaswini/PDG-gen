import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

    private static class Pox{
	public int a,b,c;
	Pox()
	{
	    a = b = c = -1;
	}

	Pox(int aa,int bb,int cc)
	{
	    a = aa;
	    b = bb;
	    c = cc;
	}
    }

    private static Pox counter(int A,int B)
    {

	if(A == 0 || B == 0)
	    {
		return new Pox(0,A,B);
	    }

	int cnt = 0;

	int dif = Math.min(A/3,B/3);
	A -= dif*3;
	B -= dif*3;
	cnt += dif*2;	

	if(A == 0 || B == 0)
	    {
		Pox ret = new Pox(cnt,A,B);
		return ret;
	    }

	if(A >= B)
	    {
		

		while(A >= 2 && 0 < B)
		    {
			A -= 2;
			B--;
			cnt++;
		    }

		while(B >= 2 && 0 < A)
		    {
			B -= 2;
			A--;
			cnt++;
		    }

	    }
	else
	    {
		while(B >= 2 && 0 < A)
		    {
			B -= 2;
			A--;
			cnt++;
		    }
		
		while(A >= 2 && 0 < B)
		    {
			A -= 2;
			B--;
			cnt++;
		    }
	    }

	

	Pox ret = new Pox(cnt,A,B);	    
	return ret;
    }
    

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	while(true)
	    {
		String[] elements = in.readLine().split(" ");
		int Mathx,Greedy,Geometry,DP,Graph,Other;
		Mathx = Integer.parseInt(elements[0]);
		Greedy = Integer.parseInt(elements[1]);
		Geometry = Integer.parseInt(elements[2]);
		DP = Integer.parseInt(elements[3]);
		Graph = Integer.parseInt(elements[4]);
		Other = Integer.parseInt(elements[5]);

		if(Mathx+Greedy+Geometry+DP+Graph+Other == 0)
		    break;

		int cnt = 0;
		Pox pox = counter(Mathx,DP);
		cnt += pox.a;
		Mathx = pox.b;
		DP = pox.c;

		pox = counter(Greedy,Graph);
		cnt += pox.a;
		Greedy = pox.b;
		Graph = pox.c;

		pox = counter(Geometry,Other);
		cnt += pox.a;
		Geometry = pox.b;
		Other = pox.c;
		
		cnt += Math.min(Mathx+DP,Math.min(Greedy+Graph,Geometry+Other));

		System.out.println(cnt);
	    }
	
    }

}