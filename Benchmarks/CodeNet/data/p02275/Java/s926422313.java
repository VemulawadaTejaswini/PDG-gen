import java.util.*;
import java.io.*;

class Main
{
    static class Len
    {	
	int[] a = new int[2500000];
	int[] b = new int[2500000];

	Len(int n)
	{
	    for(int i=0; i<=n; i++)
		{
		    a[i]=0;
		    b[i]=0;
		}
	}	

    }

    public static void main(String args[])
    {
	int n;
	int i, j, k;
	Scanner in = new Scanner(System.in);

	//read n
	n=Integer.parseInt(in.next());
	Len len = new Len(n);
	j=0;
	for(i=0; i<n; i++)
	    {
		len.a[i]=in.nextInt();
		if(j<len.a[i])j=len.a[i];
	    }

	//sort
	countingSort(len, j, n);

	//print
	for(i=1; i<n; i++)System.out.print(len.b[i]+" ");
	System.out.println(len.b[n]);

    }

    static void countingSort(Len len, int max, int n)
    {
	int i, j, k;
	int[] c = new int[max+1];

	for(i=0; i<=max; i++)c[i]=0;
	for(i=0; i<n; i++)c[len.a[i]]++;

	for(i=0; i<=max; i++)
	    {
		if(i!=0)c[i]+=c[i-1];
	    }

	for(i=n-1; i>=0; i--)
	    {
		len.b[c[len.a[i]]]=len.a[i];
		c[len.a[i]]--;
	    }
    }

}