import java.util.*;

class Main
{
    public static void main(String args[])
    {
	int n, q, C=0;
	long[] S = new long[10000];
	long k;
	Scanner read = new Scanner(System.in);

	//Read S
	n=read.nextInt();
	for(int i=0; i<n; i++)S[i]=read.nextInt();

	//search
	q=read.nextInt();
	for(int i=0; i<q; i++)
	    {
		k=read.nextInt();
		for(int j=0; j<n; j++)
		    {
			if(k==S[j])
			    {
				C++;
				break;
			    }
		    }
	    }

	//print
	System.out.println(C);
    }
}